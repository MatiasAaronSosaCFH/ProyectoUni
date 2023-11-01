package com.uni.admin.repository;

import com.uni.admin.models.paciente.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DatosPaciente extends JpaRepository<Paciente, Long> {
}
