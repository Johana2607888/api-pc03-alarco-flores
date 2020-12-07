package com.examen.service;

import java.util.List;

import com.examen.entity.Curso;
public interface CursoService {
	public List<Curso> listaCurso();
	public List<Curso> listaCursoPorNombre(String nombre);
}
