package com.uni.admin.models.paciente;


import com.uni.admin.models.paciente.datosfichas.*;
import com.uni.admin.models.paciente.enums.ActividadFisica;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "fichas_medicas")
public class FichaMedica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "fecha_de_realizacion", nullable = false)
    private LocalDate fechaDeRealizacion = LocalDate.now();
    @OneToMany
    @JoinColumn(name = "enfermedades_urinarias_id", nullable = false)
    private List<EnfermedadesUrinarias> enfermedadesUrinarias;
    @OneToMany
    @JoinColumn(name = "enfermedades_gastroenterologicas_id", nullable = false)
    private List<EnfermedadesGastroenterologicas> enfermedadesGastroenterologicas;
    @OneToMany
    @JoinColumn(name = "enfermedades_de_transmision_sexual_id", nullable = false)
    private List<EnfermedadesDeTransmisionSexual> enfermedadesDeTransmisionSexual;
    @OneToMany
    @JoinColumn(name = "enfermedades_endocrinologicas_id", nullable = false)
    private List<EnfermedadesEndocrinologicas> enfermedadesEndocrinologicas;
    @OneToMany
    @JoinColumn(name = "enfermedades_respiratorias_id", nullable = false)
    private List<EnfermedadesRespiratorias> enfermedadesRespiratorias;
    @OneToMany
    @JoinColumn(name = "enfermedades_cardiovasculares_id", nullable = false)
    private List<EnfermedadesCardiovasculares> enfermedadesCardiovasculares;
    @OneToMany
    @JoinColumn(name = "otras_enfermedades_id", nullable = false)
    private List<OtrasEnfermedades> otrasEnfermedades;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tabaquismo", nullable = false)
    private Tabaquismo tabaquismo;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "covid", nullable = false)
    private Covid covid;
    @Column(name = "altura")
    private Double altura;
    @Column(name = "peso")
    private Double peso;
    @Column(name = "imc")
    private Double imc;
    @Column(name = "talla")
    private String talla;
    @OneToMany
    @JoinColumn(name = "medicaciones")
    private List<Medicacion> medicaciones;
    @OneToMany
    @JoinColumn(name = "antecedentes_familiares")
    private List<Antecedente> antecedentesFamiliares;
    @Enumerated(EnumType.STRING)
    @Column(name = "actividad_fisica")
    private ActividadFisica actividadFisica;
    @Column(name = "tipo_de_actividad_fisica")
    private String tipoDeActividadFisica;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "aparato_cardiovascular", nullable = false)
    private AparatoCardiovascular aparatoCardiovascular;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "aparato_respiratorio", nullable = false)
    private AparatoRespiratorio aparatoRespiratorio;
    @Column(name = "glucemia")
    private String glucemiaValor;
    @Column(name = "tiempo_de_ayuno")
    private String tiempoDeAyuno;
    @Column(name = "observaciones")
    private String observaciones;
    @Column(name = "CESAC")
    private String CESAC;
    //@OneToOne(fetch = FetchType.LAZY)
    //@JoinColumn(name = "medico", nullable = false)
    //private Medico medico;
}
