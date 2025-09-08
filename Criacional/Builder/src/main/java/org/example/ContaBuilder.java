package org.example;

public class ContaBuilder {

    private Conta conta;

    public ContaBuilder () {
        conta = new Conta();
    }

    public Conta build() {
        if(conta.getConta() == 0) {
            throw new IllegalArgumentException("Conta inválida");
        }
        if(conta.getAgencia() == 0) {
            throw new IllegalArgumentException("Agencia inválida");
        }
        if(conta.getNome().isEmpty()) {
            throw new IllegalArgumentException("Nome inválido");
        }
        if(conta.getCPF().isEmpty()) {
            throw new IllegalArgumentException("CPF inválido");
        }
        if(conta.getSaldo() != 0.0) {
            throw new IllegalArgumentException("Saldo inválido");
        }
        return conta;
    }

    public ContaBuilder setConta(int contaCriada) {
        conta.setConta(contaCriada);
        return this;
    }

    public ContaBuilder setAgencia(int agencia) {
        conta.setAgencia(agencia);
        return this;
    }

    public ContaBuilder setNome(String nome) {
        conta.setNome(nome);
        return this;
    }

    public ContaBuilder setSaldo(Double saldo) {
        conta.setSaldo(saldo);
        return this;
    }

    public ContaBuilder setCPF(String cpf) {
        conta.setCPF(cpf);
        return this;
    }

    public ContaBuilder setCEP(String cep) {
        conta.setCEP(cep);
        return this;
    }

    public ContaBuilder setEnderecoUF(String enderecoUF) {
        conta.setEnderecoUF(enderecoUF);
        return this;
    }

    public ContaBuilder setEnderecoCidade(String enderecoCidade) {
        conta.setEnderecoCidade(enderecoCidade);
        return this;
    }

    public ContaBuilder setEnderecoBairro(String enderecoBairro) {
        conta.setEnderecoBairro(enderecoBairro);
        return this;
    }

    public ContaBuilder setEnderecoLogradouro(String enderecoLogradouro) {
        conta.setEnderecoLogradouro(enderecoLogradouro);
        return this;
    }

    public ContaBuilder setEnderecoNumero(int enderecoNumero) {
        conta.setEnderecoNumero(enderecoNumero);
        return this;
    }

    public ContaBuilder setEnderecoComplemento(String enderecoComplemento) {
        conta.setEnderecoComplemento(enderecoComplemento);
        return this;
    }

    public ContaBuilder setTelefone(String telefone) {
        conta.setTelefone(telefone);
        return this;
    }

    public ContaBuilder setEmail(String email) {
        conta.setEmail(email);
        return this;
    }

}
