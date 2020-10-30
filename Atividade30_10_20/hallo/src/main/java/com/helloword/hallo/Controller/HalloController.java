package com.helloword.hallo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/hallo")
public class HalloController {
	
	@GetMapping
	public String hallo()
	{
		return "O Objetivo de aprendizagem para esta semana foram: Introdução a Rest / Métodos e Status HTTP / Camadas / Mãos a Obra ****"
				+ "SOFEA um agronomo de Service Oriented Front-end Archietecture *Arquitetura de Front-end Orientada a Serviços* o front-end esta responavel por gerenciar todos os conceitos logicos relacionados a HTML, CSS e JavaScript."
				+ "Rest um agronomo de Representation State Transfer *Transferência de Estado Representacional* forma de integrar dois sistemas que seria Back end e Front end."
				+ "O metodos HTTP são GET-Obte a informação, POST-Cria um informação, PUT-Atualizaa informção DELETE-Remove a infromação, Status do HTTP-Respostas do servidor se esta ok ou não."
				+ "Camadas são as Model-Entity->resposável pela abstração e tabelas de banco de dados, "
				+ "Repository-DAO->comunicação direta com o banco de dados, Service->regra de negocio e tratativa de dados, "
				+ "Controller->End-point manipula as requisições feitas do lado de fora da API, sendo feitas pelo URL's seguindo de protocolo HTTP."
				+ "E mãos a obra em Spring Boot onde será abaixado o maven que é um gerenciador de dependências para um projeto.";
	}

}
