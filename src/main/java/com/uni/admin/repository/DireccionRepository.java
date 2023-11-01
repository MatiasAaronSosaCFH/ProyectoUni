package com.uni.admin.repository;

import com.uni.admin.models.paciente.Direccion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DireccionRepository extends JpaRepository<Direccion, Long> {
}
