package com.uni.admin.repository;

import com.uni.admin.models.paciente.FichaMedica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FichaMedicaRepository extends JpaRepository<FichaMedica, Long> {
}
