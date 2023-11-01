package com.uni.admin.repository;

import com.uni.admin.models.paciente.Direccion;
import com.uni.admin.models.paciente.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {


    List<Paciente> findByDireccion(Direccion direeccion);

    @Query("SELECT p FROM Paciente p WHERE p.direccion.barrio = :valor")
    List<Paciente> encontrarPorBarrio(@Param("valor") String barrio);

}
