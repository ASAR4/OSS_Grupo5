package upc.edu.pe.proyecto.colegio.app_colegio.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "colegio_procedencia")
@NoArgsConstructor
@AllArgsConstructor
public class ColegioProcedencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private int anhoEgreso;

    @OneToOne(mappedBy = "colegioProcedencia")
    private Estudiante estudiante;

}
