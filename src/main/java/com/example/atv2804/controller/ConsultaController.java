package com.example.atv2804.controller;

import com.example.atv2804.model.Consulta;
import com.example.atv2804.repository.ConsultaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consultas")
public class ConsultaController {
    private final ConsultaRepository repository;

    public ConsultaController(ConsultaRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Consulta> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Consulta criar(@RequestBody Consulta consulta) {
        return repository.save(consulta);
    }

    @PutMapping("/{id}")
    public Consulta atualizar(@PathVariable Long id, @RequestBody Consulta consulta) {
        consulta.setId(id);
        return repository.save(consulta);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        repository.deleteById(id);
    }
}