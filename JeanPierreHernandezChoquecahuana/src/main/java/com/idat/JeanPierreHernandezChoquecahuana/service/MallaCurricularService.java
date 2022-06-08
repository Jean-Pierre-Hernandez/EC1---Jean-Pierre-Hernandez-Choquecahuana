package com.idat.JeanPierreHernandezChoquecahuana.service;

import java.util.List;

import com.idat.JeanPierreHernandezChoquecahuana.model.MallaCurricular;

public interface MallaCurricularService {
	
	void guardarMallaCurricular(MallaCurricular mallaCurricular);
	void actualizarMallaCurricular(MallaCurricular mallaCurricular);
	void eliminarMallaCurricular(Integer id);
	List<MallaCurricular> listarMallaCurricular();
	MallaCurricular obtenerMallaCurricularId(Integer id);
	
}
