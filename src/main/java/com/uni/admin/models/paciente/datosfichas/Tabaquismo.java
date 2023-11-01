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
@Table(name = "tabaquismo")
public class Tabaquismo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "consumidor",nullable = false, columnDefinition = "TINYINT")
    private Boolean consume;
    @Column(name = "cantidad_de_cigarrillos_por_dia")
    private Integer cantidadDeCigarrillosPorDia;
    @Column(name = "hace_cuanto_tiempo")
    private String haceCuanto;
    @Column(name = "hace_cuanto_dejo")
    private String haceCuantoDejo;

}
