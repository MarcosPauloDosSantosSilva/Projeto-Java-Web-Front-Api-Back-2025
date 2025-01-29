package br.com.mpss.Projeto.Java.Web.SpringBoot.FrontEnd._5.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mpss.Projeto.Java.Web.SpringBoot.FrontEnd._5.Repository.CadastroRepository;
import br.com.mpss.Projeto.Java.Web.SpringBoot.FrontEnd._5.entities.Cadastro;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@CrossOrigin("*")
@RequestMapping("/cadastro")

public class CadastroController {
	
	@Autowired
	private CadastroRepository cadastroRepository;
	
	@GetMapping
	public List<Cadastro> buscarListaCadastro() {
		
		return (List<Cadastro>) cadastroRepository.findAll();
		
	}
	
	@GetMapping("/{id}")
	public Optional <Cadastro> buscarCadastroId(@PathVariable Long id) {
        Optional <Cadastro> buscarRealizada = cadastroRepository.findById(id);
        
        return buscarRealizada;
	
	}
	
	@PostMapping
	public Cadastro criarCadastro(@RequestBody Cadastro cadastrocriado ) {
		
		Cadastro novoCdastro = cadastroRepository.save(cadastrocriado);
		
		return novoCdastro;
		
	}
	
	@PutMapping("/{id}")
	public Cadastro editarCadastro(@PathVariable Long id, @RequestBody Cadastro editarCadastro ) {
        Cadastro cadastroEditado = cadastroRepository.save(editarCadastro);
	
		return cadastroEditado;
	}
	
	
	@DeleteMapping("/{id}")
	public Optional <Cadastro> excluirCadastro(@PathVariable Long id) {
        Optional <Cadastro> cadastroExcluido = cadastroRepository.findById(id);
        cadastroRepository.deleteById(id);
        
		return cadastroExcluido;
	}
	

}
