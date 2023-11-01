package com.uni.admin.models.paciente;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "pacientes")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "dniPasaporte", nullable = false)
    private String DNI_PASAPORTE;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "datos_paciente_id", nullable = false, referencedColumnName = "id")
    private DatosPaciente datosPaciente;
    @OneToMany
    @JoinColumn(name = "ficha_medica", nullable = false)
    private List<FichaMedica> fichaMedica;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "direccion", nullable = false)
    private Direccion direccion;
}
