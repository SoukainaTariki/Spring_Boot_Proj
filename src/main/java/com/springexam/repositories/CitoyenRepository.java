package com.springexam.repositories;

import com.springexam.entities.Citoyen;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CitoyenRepository extends JpaRepository<Citoyen, Long> {
    List<Citoyen> findByNom(String nom);
}
