package br.com.smartcities.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_restaurante")
public class Restaurante {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_restaurante")
	private Integer id;

	@Column(name = "nome_restaurante", length = 50)
	private String nome;

	@Column(name = "localizacao_restaurante", length = 50)
	private String localizacao;
	
}
