package org.example;

public abstract class Cargo {

    protected NivelTecnico nivelTecnico;

    protected float salarioBase;

    public Cargo(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setNivelTecnico(NivelTecnico nivelTecnico) {
        this.nivelTecnico = nivelTecnico;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract float calcularPRL();
}
