package com.idat.JeanPierreHernandezChoquecahuana.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.JeanPierreHernandezChoquecahuana.model.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer>{

}
