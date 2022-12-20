package br.edu.uepb.example.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

import br.edu.uepb.example.domain.*;

@Repository
public interface RepositoryAluno extends JpaRepository<Aluno, Long>{
	Optional<Aluno> findByName(String name);
}

