package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductOwnerTest {

    @Test
    void deveRetornarPRLProductOwnerEstagiario() {
        NivelTecnico nivelTecnico = new Estagiario();
        ProductOwner qualityAssurnce = new ProductOwner(1000.0f);
        qualityAssurnce.setNivelTecnico(nivelTecnico);

        assertEquals(0,qualityAssurnce.calcularPRL(), 0.01f);
    }

    @Test
    void deveRetornarPRLProductOwnerJunior() {
        NivelTecnico nivelTecnico = new Junior();
        ProductOwner qualityAssurnce = new ProductOwner(1000.0f);
        qualityAssurnce.setNivelTecnico(nivelTecnico);

        assertEquals(1300.0f,qualityAssurnce.calcularPRL(), 0.01f);
    }

    @Test
    void deveRetornarPRLProductOwnerPleno() {
        NivelTecnico nivelTecnico = new Pleno();
        ProductOwner qualityAssurnce = new ProductOwner(1000.0f);
        qualityAssurnce.setNivelTecnico(nivelTecnico);

        assertEquals(1500.0F,qualityAssurnce.calcularPRL(), 0.01f);
    }

    @Test
    void deveRetornarPRLProductOwnerSenior() {
        NivelTecnico nivelTecnico = new Senior();
        ProductOwner qualityAssurnce = new ProductOwner(1000.0f);
        qualityAssurnce.setNivelTecnico(nivelTecnico);

        assertEquals(2000.0,qualityAssurnce.calcularPRL(), 0.01f);
    }

    @Test
    void deveRetornarPRLProductOwnerEspecialista() {
        NivelTecnico nivelTecnico = new Especialista();
        ProductOwner qualityAssurnce = new ProductOwner(1000.0f);
        qualityAssurnce.setNivelTecnico(nivelTecnico);

        assertEquals(2500.0,qualityAssurnce.calcularPRL(), 0.01f);
    }
}