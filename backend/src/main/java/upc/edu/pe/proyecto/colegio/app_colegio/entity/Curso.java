package upc.edu.pe.proyecto.colegio.app_colegio.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cursos")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "curso")
    private List<SeccionCurso> seccionCurso;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "curso")
    private List<Evaluacion> evaluaciones;
}
