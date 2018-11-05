package br.com.xptosystems.api.cidades.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.xptosystems.api.cidades.models.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

	@Query("SELECT c FROM Cidade c WHERE capital = 1 ORDER BY name")
	List<Cidade> findByCapitalOrderByNameAsc();
	
	Cidade findByIbgeId(Integer ibge_id);
	
	List<Cidade> findByUf(String uf);
	
	@Query(value="SELECT uf, count(c.*) as total FROM cidades c GROUP BY uf ORDER BY total DESC LIMIT 1", nativeQuery = true)
	List<?> findTop1EstadoMaiorQuantidadeCidades();
	
	@Query(value="SELECT uf, count(c.*) as total FROM cidades c GROUP BY uf ORDER BY total LIMIT 1", nativeQuery = true)
	List<?> findTop1EstadoMenorQuantidadeCidades();
} 
