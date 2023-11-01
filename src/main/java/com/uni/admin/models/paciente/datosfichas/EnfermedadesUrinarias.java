package com.uni.admin.models.paciente.datosfichas;

import ch.qos.logback.core.joran.spi.NoAutoStart;
import com.uni.admin.models.paciente.enums.EnfermedadesGastroenterologicasENUM;
import com.uni.admin.models.paciente.enums.EnfermedadesUrinariasENUM;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode
@Table(name = "enfermedades_urinarias")
public class EnfermedadesUrinarias {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @OneToMany
    @JoinColumn(name = "aclaraciones_de_otros_id", referencedColumnName = "id")
    private List<AclaracionesDeOtros> aclaracionesDeOtros;
    @Enumerated(EnumType.STRING)
    @Column(name = "enfermedades")
    private EnfermedadesUrinariasENUM enfermedadesUrinariasENUM;
}
