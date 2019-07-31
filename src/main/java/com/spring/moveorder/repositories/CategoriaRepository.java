package com.spring.moveorder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.moveorder.model.Categorias;

@Repository
public interface CategoriaRepository extends JpaRepository<Categorias, Integer>{

}
