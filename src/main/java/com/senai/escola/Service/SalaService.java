package com.senai.escola.Service;

import com.senai.escola.Entity.Sala;
import com.senai.escola.Repository.SalaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaService {

    private final SalaRepository repository;

    public SalaService(SalaRepository repository) {
        this.repository = repository;
    }

    public List<Sala> BuscarTodos(){
        return repository.findAll();
    }

    public void Criarsala(Sala s){
        Sala sala = new Sala(s.getNome(),s.getCadeiras(),s.getMesas(),s.getLousas());
        repository.save(sala);
    }
}