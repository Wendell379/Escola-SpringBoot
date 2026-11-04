package com.senai.escola.Service;

import com.senai.escola.Entity.Professor;
import com.senai.escola.Repository.ProfessorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {

    private final ProfessorRepository repository;

    public ProfessorService(ProfessorRepository repository) {
        this.repository = repository;
    }

    public List<Professor> ListarProfessor() {
        return repository.findAll();
    }

    public void CriarProfessor(Professor p) {
        Professor professor = new Professor(p.getNome(), p.getIdade(), p.getCpf());
        repository.save(professor);
    }
}
