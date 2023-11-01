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
@Table(name = "covid")
public class Covid {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "tuvo_covid", columnDefinition = "TINYINT", nullable = false)
    private Boolean tuvo;
    @Column(name = "hace_cuanto_tuvo")
    private String haceCuanto;
    @Column(name = "secuelas")
    private String secuelas;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vacunacion_id", referencedColumnName = "id")
    private Vacunacion vacunacion;
}
