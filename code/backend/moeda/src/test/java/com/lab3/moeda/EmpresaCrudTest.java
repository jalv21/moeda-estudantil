package com.lab3.moeda;

import com.lab3.moeda.model.EmpresaEntity;
import com.lab3.moeda.repository.EmpresaRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;

@DataJpaTest
public class EmpresaCrudTest {
    @Autowired
    private EmpresaRepository empresaRepository;
    private EmpresaEntity cafe, papelaria, farmacia;

    @BeforeEach
    void setUp() {
        cafe = new EmpresaEntity("Café Mentor", "12345678941001", "Rua 1", "contato@cafementor.com", "123456");
        papelaria = new EmpresaEntity("Papelaria Maria", "12345678941002", "Rua 2", "contato@papelariamaria.com", "123456");
        farmacia = new EmpresaEntity("Farmácia Droga Rara", "12345678941003", "Rua 3", "contato@drogarara.com", "123456");
    }
}
