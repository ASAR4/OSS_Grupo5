package upc.edu.pe.proyecto.colegio.app_colegio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import upc.edu.pe.proyecto.colegio.app_colegio.entity.Curso;

public interface CursoRepository extends JpaRepository<Curso,Long> {
}
