package com.example.nextedubd.repositories.users;

import com.example.nextedubd.entities.users.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}
