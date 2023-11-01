package com.uni.admin.models.paciente.datosfichas;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode
@Table(name = "vacunacion")
public class Vacunacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "vacunado", nullable = false, columnDefinition = "TINYINT")
    private Boolean vacunado;
    @Column(name = "cantidad")
    private Integer cantidad;
    @Column(name = "cuales", columnDefinition = "TEXT")
    private String cuales;

}