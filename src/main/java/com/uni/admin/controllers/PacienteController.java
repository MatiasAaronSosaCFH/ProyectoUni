package com.uni.admin.controllers;

import com.uni.admin.models.paciente.Direccion;
import com.uni.admin.models.paciente.Paciente;
import com.uni.admin.models.paciente.dto.DireccionDTO;
import com.uni.admin.servicio.PacienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/paciente")
public class PacienteController {

    @Autowired
    private PacienteServicio pacienteServicio;
    @GetMapping("/todos")
    public ResponseEntity<Page<Paciente>> pacientesPaginados(@RequestParam(defaultValue = "1") Integer page,
                                                             @RequestParam(defaultValue = "10") Integer size,
                                                             @RequestParam(defaultValue = "id") String sortBy,
                                                             @RequestParam(defaultValue = "ASC") String sortOrder){

        Page<Paciente> pacientes = pacienteServicio.listarTodosLosPaciente(page, size, sortBy, sortOrder);
        if (!pacientes.hasNext()){
            return ResponseEntity.notFound().build();
        }else{
            return ResponseEntity.ok(pacientes);
        }
    }

    @GetMapping("/direccion")
    public ResponseEntity<List<Paciente>> buscarPacientesPorDireccion(@RequestBody DireccionDTO direccion){
        List<Paciente> pacientes = pacienteServicio.buscarPorDireccion(Direccion.transformar(direccion));
        if(pacientes.isEmpty()) return ResponseEntity.noContent().build();
        else return ResponseEntity.ok(pacientes);
    }

    @GetMapping("/buscar-dni")
    public ResponseEntity<Paciente> buscarPorDni(@RequestBody String dni){
        Optional<Paciente> paciente = pacienteServicio.busquedaPorDni(dni);
        return paciente.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/buscar-barrio")
    public ResponseEntity<List<Paciente>> buscarPorDireccion(@RequestBody String barrio){
        List<Paciente> pacientes = pacienteServicio.buscarPorBarrio(barrio);
        if (pacientes.isEmpty()) return new ResponseEntity<>( new ArrayList<>(), HttpStatus.NO_CONTENT);
        else return ResponseEntity.ok(pacientes);
    }
}
