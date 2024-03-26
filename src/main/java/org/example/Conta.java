package org.example;

public class Conta implements Cloneable {

    private String conta;
    private String agencia;
    private String portador;
    private String documento;

    public Conta(String conta, String agencia, String portador, String documento) {
        this.conta = conta;
        this.agencia = agencia;
        this.portador = portador;
        this.documento = documento;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getPortador() {
        return portador;
    }

    public void setPortador(String portador) {
        this.portador = portador;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Conta{" +
                "conta='" + conta + '\'' +
                "agencia='" + agencia + '\'' +
                "portador='" + portador + '\'' +
                ", documento=" + documento +
                '}';
    }
}
