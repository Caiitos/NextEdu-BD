package com.example.nextedubd.repositories.users;

import com.example.nextedubd.entities.users.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
