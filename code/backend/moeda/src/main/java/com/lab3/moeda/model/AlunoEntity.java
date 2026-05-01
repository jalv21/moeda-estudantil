package com.lab3.moeda.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "alunos")
public class AlunoEntity<E> extends UsuarioComSaldoEntity<E> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cpf;
    private String rg;
    private String endereco;
    private String curso;

    public AlunoEntity(String nome, String cpf, String rg, String endereco, String curso) {
        super(nome);
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
        this.curso = curso;
    }

    public AlunoEntity() {
        super();
    }

    @Override
    protected List<E> consultarHistorico() {
        // TODO retorna histórico de transações do Aluno no formato de lista.
        throw new UnsupportedOperationException("Método ainda não implementado.");
    }
}
