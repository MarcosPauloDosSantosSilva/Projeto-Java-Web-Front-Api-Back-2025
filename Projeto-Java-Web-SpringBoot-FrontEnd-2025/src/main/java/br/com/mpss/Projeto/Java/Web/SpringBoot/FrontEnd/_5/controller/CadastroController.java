package br.com.mpss.Projeto.Java.Web.SpringBoot.FrontEnd._5.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class CadastroController {
	
	@GetMapping("/cadastro")
	public String AcessandoApi() {
		
		return "A class controle esta sendo acessada via ApiTeste";
		
	}

}
