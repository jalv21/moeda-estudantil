package com.lab3.moeda.model;

import jakarta.persistence.*;

import java.util.LinkedList;
import java.util.List;

@Entity
@Table(name = "alunos")
public class AlunoEntity extends UsuarioAcademicoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cpf;
    private String rg;
    private String endereco;
    private String curso;

    public AlunoEntity() {
        super();
    }

    public AlunoEntity(String nome, String cpf, String rg, String endereco, String curso) {
        super(nome);
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
        this.curso = curso;
    }

    public int getSaldo() { return saldoMoedas; }

    @Override
    public void creditarMoedas(int valor) {
        if(saldoMoedas > LIMITE_MOEDAS)
            throw new IllegalStateException("Não foi possível creditar. " +
                    " Saldo do aluno excedeu o limite de moedas.");

        saldoMoedas += valor;
    }

    @Override
    public void debitarMoedas(int valor) {
        if((saldoMoedas - valor) < 0)
            throw new IllegalStateException("Não foi possível debitar. " +
                    "Aluno não tem saldo suficiente.");

        saldoMoedas -= valor;
    }

    @Override
    public List<Transacao> consultarHistoricoTransacoes() {
        // TODO retorna histórico de transações do Aluno no formato de lista.
        throw new UnsupportedOperationException("Método ainda não implementado.");
    }
}
