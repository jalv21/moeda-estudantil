package com.lab3.moeda;

import com.lab3.moeda.model.AlunoEntity;
import com.lab3.moeda.model.UsuarioAcademicoEntity;
import com.lab3.moeda.repository.AlunoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;
import org.springframework.boot.jpa.test.autoconfigure.TestEntityManager;

@DataJpaTest
public class CrudTest {
    @Autowired
    private AlunoRepository alunoRepository;

    @Test
    void create() {
        AlunoEntity alice = new AlunoEntity("Alice", "12345678910", "123456789", "Rua 1", "UFMG", "Biologia");

        alunoRepository.save(alice);
    }
}
