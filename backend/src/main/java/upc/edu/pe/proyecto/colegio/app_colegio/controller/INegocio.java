package upc.edu.pe.proyecto.colegio.app_colegio.controller;

import upc.edu.pe.proyecto.colegio.app_colegio.entity.Curso;
import upc.edu.pe.proyecto.colegio.app_colegio.entity.Estudiante;

import java.util.List;

public interface INegocio {

    public Curso crearCurso(Curso curso);
    public List<Curso> listarCursos();

    public List<Estudiante> listarEstudiantes();
    public Estudiante crearEstudiante(Estudiante estudiante);
    public void borrarEstudiante(Long id);

}
