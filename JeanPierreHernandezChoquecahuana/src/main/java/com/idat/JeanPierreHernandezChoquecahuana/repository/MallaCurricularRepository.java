package com.idat.JeanPierreHernandezChoquecahuana.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.JeanPierreHernandezChoquecahuana.model.MallaCurricular;

@Repository
public interface MallaCurricularRepository extends JpaRepository<MallaCurricular, Integer>{

}
