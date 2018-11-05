package br.com.xptosystems.api.cidades.resources;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.xptosystems.api.cidades.models.Cidade;
import br.com.xptosystems.api.cidades.repository.CidadeRepository;
import br.com.xptosystems.api.utils.CsvUtils;

@RestController
@RequestMapping(value = "/v1")
public class CidadeResource {

	@Autowired
	CidadeRepository cidadeRepository;
	
	@GetMapping("/cidades")
	public List<Cidade> cidades() {
		return cidadeRepository.findAll();
	}
	
	@PostMapping("/cidades/importar")
	public Boolean importar() throws IOException {
		InputStream file = getClass().getResourceAsStream("cidades.csv");
		
		cidadeRepository.saveAll(CsvUtils.read(Cidade.class, file));
		return true;
	}
	
	@GetMapping("/cidades/capitais")
	public List<Cidade> capitais() {
		return cidadeRepository.findByCapitalOrderByNameAsc();
	}
	
	@GetMapping("/cidades/{ibge}")
	public Cidade getByIbgeId(@PathVariable Integer ibge) {
		return cidadeRepository.findByIbgeId(ibge);
	}
	
	@GetMapping("/estados/{uf}/cidades")
	public List<Cidade> getByUf(@PathVariable String uf) {
		return cidadeRepository.findByUf(uf);
	}
	
	@PostMapping("/cidades")
	public Cidade salvarCidade(@RequestBody Cidade cidade) {
		return cidadeRepository.save(cidade);
	}
	
	@DeleteMapping("/cidades/{ibge}")
	public void excluirCidade(@PathVariable Integer ibge) {
		cidadeRepository.deleteById(ibge);
	}
	
	@GetMapping("/estados/{uf}/cidades/count")
	public Integer getQdteCidadesByUf(@PathVariable String uf) {
		return cidadeRepository.findByUf(uf).size();
	}
	
	@GetMapping("/estados/cidades/maior")
	public List<?> getEstadoMaiorQtdCidades() {
		return cidadeRepository.findTop1EstadoMaiorQuantidadeCidades();
	}
	
	@GetMapping("/estados/cidades/menor")
	public List<?> getEstadoMenorQtdCidades() {
		return cidadeRepository.findTop1EstadoMenorQuantidadeCidades();
	}
	
	@GetMapping("/cidades/count")
	public long getTotalCidades() {
		return cidadeRepository.count();
	}
}
