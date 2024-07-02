package upc.edu.pe.proyecto.colegio.app_colegio.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name = "profesores")
@NoArgsConstructor
@AllArgsConstructor
public class Profesor {
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
    private boolean ismale;
    private String direccion;
    private String email;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "profesor")
    private List<SeccionCurso> seccionCurso;



}