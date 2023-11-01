package com.uni.admin.servicio;

import com.uni.admin.models.paciente.Direccion;
import com.uni.admin.models.paciente.Paciente;
import com.uni.admin.repository.PacienteRepository;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@Transactional
public class PacienteServicio {

    @Autowired
    private PacienteRepository pacienteRepository;
    @Autowired
    private EntityManager entityManager;

    public Page<Paciente> listarTodosLosPaciente(Integer page, Integer size, String sortBy, String sortOrder){
        Pageable paginas = PageRequest.of(page - 1,size, Sort.by(Sort.Direction.fromString(sortOrder), sortBy));
        return pacienteRepository.findAll(paginas);
    }

    public Optional<Paciente> buscarPaciente(Long id){
        return pacienteRepository.findById(id);
    }

    public void guardar(Paciente paciente){
        pacienteRepository.save(paciente);
    }

    public List<Paciente> buscarPorDireccion(Direccion direccion){
        return pacienteRepository.findByDireccion(direccion);
    }

    //METODO A COMPLETAR, BUSQUEDA POR ENFERMEDAD
    public Optional<Paciente> buscarPacientePorEnfermedad(String enfermedad, String enfermedadespecifica){
        String jpql = "SELECT p FROM Paciente p JOIN FichaMedica f LEFTJOIN :enferdad.:enfermedadespecifica= enfermedadespecifica";
        return null;
    }

    public Optional<Paciente> busquedaPorDni(String dni){
        String jpql = "SELECT p FROM Paciente p WHERE DNI_PASAPORTE = :valor";
        TypedQuery<Paciente> query = entityManager.createQuery(jpql, Paciente.class);
        query.setParameter("valor", dni);
        return Optional.of(query.getSingleResult());
    }

    public List<Paciente> buscarPorBarrio(String barrio){
        return pacienteRepository.encontrarPorBarrio(barrio);
    }
}
