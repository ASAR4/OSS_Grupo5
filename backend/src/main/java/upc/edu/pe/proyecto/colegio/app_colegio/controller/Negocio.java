package upc.edu.pe.proyecto.colegio.app_colegio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import upc.edu.pe.proyecto.colegio.app_colegio.entity.Curso;
import upc.edu.pe.proyecto.colegio.app_colegio.entity.Estudiante;
import upc.edu.pe.proyecto.colegio.app_colegio.repository.CursoRepository;
import upc.edu.pe.proyecto.colegio.app_colegio.repository.EstudianteRepository;

import java.util.List;

@Service
public class Negocio implements  INegocio{
    @Autowired
    private CursoRepository cursoRepository;

    @Autowired
    private EstudianteRepository estudianteRepository;

    @Override
    public Curso crearCurso(Curso curso) {
        return cursoRepository.save(curso);
    }

    @Override
    public List<Curso> listarCursos() {
        return cursoRepository.findAll();
    }

    @Override
    public List<Estudiante> listarEstudiantes() {
        return estudianteRepository.findAll();
    }

    @Override
    public Estudiante crearEstudiante(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    @Override
    public void borrarEstudiante(Long id) {
        estudianteRepository.deleteById(id);
    }
}
