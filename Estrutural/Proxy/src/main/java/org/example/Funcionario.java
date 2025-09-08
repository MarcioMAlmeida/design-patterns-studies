package org.example;

import java.util.Arrays;
import java.util.List;

public class Funcionario implements IFuncionario {

    private String nome;
    private String cpf;
    private String email;
    private boolean ativo;


    public Funcionario(String cpf) {
        this.cpf = cpf;
        Funcionario objeto = BD.getFuncionario(cpf);
        this.nome = objeto.nome;
        this.ativo = objeto.ativo;
        this.email = objeto.email;
    }

    public Funcionario(String nome, String cpf, String email, boolean ativo) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.ativo = ativo;
    }

    public String getCpf() {
        return cpf;
    }

    public boolean getAtivo() {
        return ativo;
    }

    @Override
    public List<String> obterDadosFuncionario() {
        return Arrays.asList(nome, cpf, email);
    }

    @Override
    public boolean demitirFuncionario(Gerente gerente) {
        this.ativo = false;
        return this.ativo;
    }
}
