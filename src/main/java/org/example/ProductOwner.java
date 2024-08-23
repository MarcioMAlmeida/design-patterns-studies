package org.example;

public class ProductOwner extends Cargo {

    public ProductOwner(float salarioBase) {
        super(salarioBase);
    }

    public float calcularPRL() {
        return this.salarioBase * (1 + this.nivelTecnico.multiplicadorPRL());
    }
}
