package com.example.atv2804.repository;

import com.example.atv2804.model.Consulta;
import com.example.atv2804.model.Medico;
import com.example.atv2804.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultaRepository extends JpaRepository<Consulta, Long> {
}