package br.com.xptosystems.api.cidades.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cidades") 
public class Cidade implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="ibge_id")
	private Integer ibgeId;
	
	private String uf;
	
	@Column(name="name")
	private String nome;
	
	@Column(name="capital")
	private Character isCapital;
	
	@Column(name="lon")
	private String longitude;
	
	@Column(name="lat")
	private String latitude;
	
	@Column(name="no_accents")  
	private String nomeSemAcento;
	
	@Column(name="alternative_names")
	private String nomeAlternativo;
	
	@Column(name="microregion")
	private String microregiao;
	
	@Column(name="mesoregion")
	private String mesoregiao;

	
	public int getIbge_id() {
		return ibgeId;
	}

	public void setIbge_id(int ibge_id) {
		this.ibgeId = ibge_id;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Character getIsCapital() {
		return isCapital;
	}

	public void setIsCapital(Character isCapital) {
		this.isCapital = isCapital;
	}

	public String getLongitude() {
		return longitude; 
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() { 
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getNomeSemAcento() {
		return nomeSemAcento;
	}

	public void setNomeSemAcento(String nomeSemAcento) {
		this.nomeSemAcento = nomeSemAcento;
	}

	public String getNomeAlternativo() {
		return nomeAlternativo;
	}

	public void setNomeAlternativo(String nomeAlternativo) {
		this.nomeAlternativo = nomeAlternativo;
	}

	public String getMicroregiao() {
		return microregiao;
	}

	public void setMicroregiao(String microregiao) {
		this.microregiao = microregiao;
	}

	public String getMesoregiao() {
		return mesoregiao;
	}

	public void setMesoregiao(String mesoregiao) {
		this.mesoregiao = mesoregiao;
	}
}
