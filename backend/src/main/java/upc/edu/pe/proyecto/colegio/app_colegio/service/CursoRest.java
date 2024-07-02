package upc.edu.pe.proyecto.colegio.app_colegio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import upc.edu.pe.proyecto.colegio.app_colegio.controller.INegocio;
import upc.edu.pe.proyecto.colegio.app_colegio.entity.Curso;
import upc.edu.pe.proyecto.colegio.app_colegio.entity.Estudiante;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE,RequestMethod.PUT})
public class CursoRest {
    @Autowired
    private INegocio iNegocio;

    @GetMapping("/cursos")
    public List<Curso> listarCursos(){
        return iNegocio.listarCursos();
    }

    @PostMapping("/curso")
    public Curso registrarCurso(@RequestBody Curso curso){
        return iNegocio.crearCurso(curso);
    }

    @GetMapping("/estudiantes")
    public List<Estudiante> listarEstudiantes(){
        return iNegocio.listarEstudiantes();
    }

    @PostMapping("/estudiante")
    public Estudiante registrarEstudiante(@RequestBody Estudiante estudiante){
        return iNegocio.crearEstudiante(estudiante);
    }

    @DeleteMapping("/estudiante/{id}")
    public void borrarEstudiantePorId(@PathVariable(value = "id") Long id) {
        iNegocio.borrarEstudiante(id);
    }
}
