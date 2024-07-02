package upc.edu.pe.proyecto.colegio.app_colegio.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "estudiante")
@NoArgsConstructor
@AllArgsConstructor
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int tipoDocumento;
    private String numeroDocumento;
    private Date fechaNacimiento;
    private String numeroCelular;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "colegio_procedencia_id")
    private ColegioProcedencia colegioProcedencia;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "apoderado_id")
    private Apoderado apoderado;

    private boolean ismale;
    private String direccion;
    private String email;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "estudiante")
    private List<SeccionCursoEstudiante> seccionCursoEstudiantes;

}