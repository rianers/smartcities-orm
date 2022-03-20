package br.com.smartcities;

import jakarta.persistence.Persistence;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		//Insira um login e password Fiap Oracle no arquivo 'persistence.xml'
		
		  Persistence.createEntityManagerFactory("smartcities-orm").createEntityManager();
	}

}
