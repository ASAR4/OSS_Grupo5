package upc.edu.pe.proyecto.colegio.app_colegio.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@Table(name = "apoderados")
@NoArgsConstructor
@AllArgsConstructor
public class Apoderado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int tipoDocumento;
    private String numeroDocumento;
    private String numeroCelular;
    private String direccion;
    private String email;

    @OneToMany(fetch = FetchType.LAZY,mappedBy = "apoderado")
    private List<Estudiante> estudiantes;

}
