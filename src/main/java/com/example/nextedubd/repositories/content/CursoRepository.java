package com.example.nextedubd.repositories.content;

import com.example.nextedubd.entities.content.Curso;
import com.example.nextedubd.entities.users.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}
