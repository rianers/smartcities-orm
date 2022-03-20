package br.com.smartcities.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_pizza")
public class Pizza {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pizza")
	private Integer id;

	@Column(name = "nome_pizza", length = 50)
	private String nome;

	@Column(name = "descricao_pizza", length = 50)
	private String descricao;
	
	@Column(name = "valor_pizza", length = 50)
	private Double valor;

}