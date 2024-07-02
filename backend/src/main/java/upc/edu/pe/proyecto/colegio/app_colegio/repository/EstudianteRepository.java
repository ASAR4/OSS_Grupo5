package upc.edu.pe.proyecto.colegio.app_colegio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import upc.edu.pe.proyecto.colegio.app_colegio.entity.Estudiante;

public interface EstudianteRepository extends JpaRepository<Estudiante,Long> {
}
