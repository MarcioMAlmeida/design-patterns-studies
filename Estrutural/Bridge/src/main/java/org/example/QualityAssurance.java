package org.example;

public class QualityAssurance extends Cargo {

    public QualityAssurance(float salarioBase) {
        super(salarioBase);
    }

    public float calcularPRL() {
        return (1.5f * this.salarioBase) * (1 + this.nivelTecnico.multiplicadorPRL());
    }
}
