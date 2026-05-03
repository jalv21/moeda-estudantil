package com.lab3.moeda.dto;

public record EmpresaRequestDTO (
        String nome,
        String cnpj,
        String endereco,
        String email,
        String senha
) {}