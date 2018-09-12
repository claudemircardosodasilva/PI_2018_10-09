package com.br.projetoPI2018.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.projetoPI2018.model.Pessoa;
import com.br.projetoPI2018.repository.PessoaRepository;

@Service
public class PessoaService {
	
	private PessoaRepository pessoaRepository;
	
	public void inserir(Pessoa pessoa) {
		pessoaRepository.save(pessoa);
	}
}
