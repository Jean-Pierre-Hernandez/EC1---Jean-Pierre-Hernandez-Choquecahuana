package com.idat.JeanPierreHernandezChoquecahuana.service;

import java.util.List;

import com.idat.JeanPierreHernandezChoquecahuana.model.Curso;

public interface CursoService {
	
	void guardarCurso(Curso curso);
	void actualizarCurso(Curso curso);
	void eliminarCurso(Integer id);
	List<Curso> listarCurso();
	Curso obtenerCursoId(Integer id);

}
