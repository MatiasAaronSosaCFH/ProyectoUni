package com.uni.admin.models.paciente;


import com.uni.admin.models.paciente.dto.DireccionDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Data
@Table(name = "direcciones")
public class Direccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "barrio", nullable = false)
    private String barrio;
    @Column(name = "localidad", nullable = false)
    private String localidad;
    @Column(name = "domicilio", nullable = false)
    private String domicilio;

    public Direccion(DireccionDTO direccionDTO){
        this.id=direccionDTO.id();
        this.barrio=direccionDTO.barrio();
        this.domicilio=direccionDTO.domicilio();
        this.localidad=direccionDTO.localidad();
    }

    public static Direccion transformar(DireccionDTO direecionDTO){
        return new Direccion(direecionDTO);
    }
}
