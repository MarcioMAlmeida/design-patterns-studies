package org.example;

public class PessoaVisitor implements Visitor {

    public String exibir(Pessoa pessoa) {
        return pessoa.aceitar(this);
    }

    @Override
    public String exibirCliente(Cliente cliente) {
        return "Cliente{" +
                "nome='" + cliente.getNome() + '\'' +
                '}';
    }

    @Override
    public String exibirFuncionario(Funcionario funcionario) {
        return "Funcionario{" +
                "nome='" + funcionario.getNome() + '\'' +
                ", cargo='" + funcionario.getCargo() + '\'' +
                ", salario=" + funcionario.getSalario() +
                '}';
    }

    @Override
    public String exibirGerente(Gerente gerente) {
        return "Gerente{" +
                "nome='" + gerente.getNome() + '\'' +
                ", setor='" + gerente.getCargo() + '\'' +
                ", salario=" + gerente.getSalario() +
                '}';
    }
}
