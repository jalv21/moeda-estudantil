package com.lab3.moeda.service;

import com.lab3.moeda.dto.AlunoRequestDTO;
import com.lab3.moeda.dto.AlunoResponseDTO;
import com.lab3.moeda.model.AlunoEntity;
import com.lab3.moeda.repository.AlunoRepository;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {
    private final AlunoRepository alunoRepository;

    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    // CREATE
    public AlunoResponseDTO criar(AlunoRequestDTO request) {
        AlunoEntity novoAluno = new AlunoEntity(
                request.nome(), request.cpf(), request.rg(),
                request.endereco(), request.instituicao(), request.curso()
        );
        AlunoEntity alunoSalvo = alunoRepository.save(novoAluno);
        return toResponseDTO(alunoSalvo);
    }

    // Conversão entidade → DTO de resposta
    private AlunoResponseDTO toResponseDTO(AlunoEntity aluno) {
        return new AlunoResponseDTO(
                aluno.getId(),
                aluno.getNome(),
                aluno.getCpf(),
                aluno.getEndereco(),
                aluno.getInstituicao(),
                aluno.getCurso(),
                aluno.getSaldoMoedas(),
                aluno.getEmail(),
                aluno.getSenha()
        );
    }
}
