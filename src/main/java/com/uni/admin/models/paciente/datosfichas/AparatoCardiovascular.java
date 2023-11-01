package com.uni.admin.models.paciente.datosfichas;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "aparato_cardiovascular")
public class AparatoCardiovascular {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "frecuencia_cardiaca", nullable = false)
    private String frecuenciaCardiaca; //LPM
    @Column(name = "tension_arterial", nullable = false)
    private String tensionArterial; //MMHG

}
