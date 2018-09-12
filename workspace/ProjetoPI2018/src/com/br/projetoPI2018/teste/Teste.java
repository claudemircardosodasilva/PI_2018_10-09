package com.br.projetoPI2018.teste;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.br.projetoPI2018.model.Pessoa;
import com.br.projetoPI2018.service.PessoaService;
@Controller
@RequestMapping("/teste")
public class Teste {
	@Autowired
	private PessoaService pessoas;
	@RequestMapping("/salvar")
	public void testeInserir() {
		Pessoa p = new Pessoa();
		p.setNome("rodrigo");
		p.setCpf("41494131854");
		p.setEmail("rodrigo@rodrigo");
		p.setTelefone("999999999999");
		
		pessoas.inserir(p);	
		
	}
	
	
	
}
