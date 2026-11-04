package com.senai.escola.Controller;

import com.senai.escola.Entity.Sala;
import com.senai.escola.Service.SalaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class SalaController {

    private final SalaService service;

    public SalaController(SalaService service) {
        this.service = service;
    }

    @GetMapping("/sala")
    public List<Sala> MostrarSala(){
        return service.BuscarTodos();
    }
    @PostMapping("/sala")
    public void CriarSala(@RequestBody Sala s){
        service.Criarsala(s);
    }
}
