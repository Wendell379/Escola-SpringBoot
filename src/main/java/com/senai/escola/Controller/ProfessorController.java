package com.senai.escola.Controller;

import com.senai.escola.Entity.Professor;
import com.senai.escola.Service.ProfessorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProfessorController {

    private final ProfessorService service;

    public ProfessorController(ProfessorService service) {
        this.service = service;
    }

    @GetMapping("/professor")
    public List<Professor> MostrarProfessor(){
        return service.ListarProfessor();
    }
    @PostMapping("/professor")
    public void CriarProfessor(@RequestBody Professor p) {
        service.CriarProfessor(p);
    }
}