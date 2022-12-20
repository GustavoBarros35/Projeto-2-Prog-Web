package br.edu.uepb.example.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.uepb.example.domain.Aluno;

@Repository
public interface RepositoryAluno extends JpaRepository<Aluno, Long> {
    Optional<Aluno> findByName(String name);
}
