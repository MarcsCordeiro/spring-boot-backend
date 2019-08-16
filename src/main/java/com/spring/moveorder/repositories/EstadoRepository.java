package com.spring.moveorder.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.moveorder.model.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer>{

}
