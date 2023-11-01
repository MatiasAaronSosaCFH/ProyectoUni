package com.uni.admin.models.paciente.datosfichas;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "aparato_respiratorio")
public class AparatoRespiratorio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "sp_02", nullable = false)
    private String Sp02; //%
    @Column(name = "frecuencia_respiratoria", nullable = false)
    private String frecuenciaRespiratoria;//RMP
}
