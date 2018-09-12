package com.br.projetoPI2018.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.projetoPI2018.model.Pessoa;
@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
