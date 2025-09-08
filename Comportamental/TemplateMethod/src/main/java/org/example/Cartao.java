package org.example;

public abstract class Cartao {

    private String numero;
    protected String nome;
    protected Double gastos;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getGastos() {
        return gastos;
    }

    public void setGastos(Double gastos) {
        this.gastos = gastos;
    }

    public abstract Double calcularPontos();

    public String getTipo() {
        return "Cartao";
    }

    public String getInfo() {
        return getTipo() + "{"
                + "numero=" + numero +
                ", nome=" + nome + '\'' +
                ", pontos=" + calcularPontos() + '}';
    }
}
