package com.uni.admin.models.paciente;

import com.uni.admin.models.paciente.enums.EstadoCivil;
import com.uni.admin.models.paciente.enums.NivelEducativo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "datos_paciente")
public class DatosPaciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "apellido", nullable = false)
    private String apellido;
    @Column(name = "fecha_de_nacimiento", nullable = false)
    private Date fechaDeNacimiento;
    @Column(name = "nacionalidad", nullable = false)
    private String nacionalidad;
    @Column(name = "edad", nullable = false)
    private String edad;
    @Enumerated(EnumType.STRING)
    @Column(name = "estado_civil",nullable = false)
    private EstadoCivil estadoCivil;
    @Column(name = "cantidad_de_hijos")
    private Integer cantidadDeHijos;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "ocupacion")
    private String ocupacion;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "obra_social_id", nullable = false, referencedColumnName = "id")
    private ObraSocial obraSocial;
    @Enumerated(EnumType.STRING)
    @Column(name = "nivel_educativo")
    private NivelEducativo nivelEducativo;

}
