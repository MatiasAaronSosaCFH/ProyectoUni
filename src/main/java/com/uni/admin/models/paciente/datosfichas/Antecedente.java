package com.uni.admin.models.paciente.datosfichas;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Table(name = "antecedentes")
public class Antecedente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "antecedentes_padre")
    private String antPadre;
    @Column(name = "antecedentes_madre")
    private String antMadre;
    @Column(name = "antecedentes_hermanos")
    private String antHermanos;
}
