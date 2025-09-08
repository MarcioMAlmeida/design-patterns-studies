package org.example;

public class Desenvolvedor extends Cargo {

    public Desenvolvedor(float salarioBase) {
        super(salarioBase);
    }

    public float calcularPRL() {
        return (2 * this.salarioBase) * (1 + this.nivelTecnico.multiplicadorPRL());
    }
}
