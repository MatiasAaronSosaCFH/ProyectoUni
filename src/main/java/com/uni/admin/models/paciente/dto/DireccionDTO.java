package com.uni.admin.models.paciente.dto;

import com.uni.admin.models.paciente.Direccion;

public record DireccionDTO(Long id,
                           String barrio,
                           String localidad,
                           String domicilio) {

    public DireccionDTO(Direccion direccion){
        this(direccion.getId(),direccion.getBarrio(), direccion.getLocalidad(), direccion.getDomicilio());
    }
}
