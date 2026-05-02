package com.lab3.moeda;

import com.lab3.moeda.dto.AlunoRequestDTO;
import com.lab3.moeda.model.AlunoEntity;
import com.lab3.moeda.repository.AlunoRepository;
import com.lab3.moeda.service.AlunoService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DataJpaTest
public class CrudTest {
    @Autowired
    private AlunoRepository alunoRepository;

    private AlunoService alunoService;

    private AlunoEntity alice;

    @BeforeEach
    void setUp() {
        alice = new AlunoEntity("Alice", "12345678910", "123456789", "Rua 1", "UFMG", "Biologia");
        alunoService = new AlunoService(alunoRepository);
    }

    @Test
    void createViaRepository() {
        alunoRepository.save(alice);
    }

    @Test
    void createViaService() {
        AlunoRequestDTO alunoRequest = new AlunoRequestDTO(
                alice.getNome(),
                alice.getCpf(),
                alice.getRg(),
                alice.getEndereco(),
                alice.getInstituicao(),
                alice.getCurso()
        );

        alunoService.criar(alunoRequest);
    }
}
