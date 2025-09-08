package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaVisitorTest {

    @Test
    void deveExibirCliente() {
        Cliente cliente = new Cliente("João");

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Cliente{nome='João'}",visitor.exibirCliente(cliente));
    }

    @Test
    void deveExibirFuncionario() {
        Funcionario funcionario = new Funcionario("João","Vendedor",1000.0);

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Funcionario{nome='João', cargo='Vendedor', salario=1000.0}",visitor.exibirFuncionario(funcionario));
    }

    @Test
    void deveExibirGerente() {
        Gerente gerente = new Gerente("João","Vendas",2500.0);

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Gerente{nome='João', setor='Vendas', salario=2500.0}",visitor.exibirGerente(gerente));
    }
}