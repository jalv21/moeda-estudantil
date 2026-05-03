package com.lab3.moeda.dto;

public record EmpresaResponseDTO(
        int id,
        String nome,
        String cnpj,
        String endereco,
        String email,
        String senha
) {}
