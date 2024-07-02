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
@Table(name = "seccion_curso_estudiante")
public class SeccionCursoEstudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "seccion_curso_id")
    private SeccionCurso seccionCurso;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "estudiante_id")
    private Estudiante estudiante;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "seccionCursoEstudiante")
    private List<Asistencia> asistencias;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "seccionCursoEstudiante")
    private List<Nota> notas;

}
