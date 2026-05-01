package com.lab3.moeda.model;

import java.util.LinkedList;
import java.util.List;

public abstract class UsuarioAcademicoEntity extends UsuarioEntity {
    public static final int LIMITE_MOEDAS = 99999;
    protected int saldoMoedas;
    List<Transacao> historicoTransacoes;

    protected void init() {
        historicoTransacoes = new LinkedList<>();
        saldoMoedas = 0;
    }

    protected UsuarioAcademicoEntity() {
        super();
        init();
    }

    protected UsuarioAcademicoEntity(String nome) {
        super(nome);
        init();
    }

    protected abstract void creditarMoedas(int valor);

    protected abstract void debitarMoedas(int valor);

    protected abstract List<Transacao> consultarHistoricoTransacoes();
}
