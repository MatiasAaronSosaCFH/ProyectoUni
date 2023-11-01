package com.uni.admin.models.paciente.datosfichas;

import com.uni.admin.models.paciente.enums.EnfermedadesDeTransmisionSexualENUM;
import com.uni.admin.models.paciente.enums.OtrasEnfermedadesENUM;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Data
@Table(name = "otras_enfermedades")
public class OtrasEnfermedades {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @OneToMany
    @JoinColumn(name = "aclaraciones_de_otros_id", referencedColumnName = "id")
    private List<AclaracionesDeOtros> aclaracionesDeOtros;
    @Enumerated(EnumType.STRING)
    @Column(name = "enfermedades")
    private OtrasEnfermedadesENUM otrasEnfermedadesENUM;
}
