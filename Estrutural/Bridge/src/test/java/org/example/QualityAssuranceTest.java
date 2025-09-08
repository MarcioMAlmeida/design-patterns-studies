package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QualityAssuranceTest {

    @Test
    void deveRetornarPRLQualityAssuranceEstagiario() {
        NivelTecnico nivelTecnico = new Estagiario();
        QualityAssurance qualityAssurnce = new QualityAssurance(1000.0f);
        qualityAssurnce.setNivelTecnico(nivelTecnico);

        assertEquals(0,qualityAssurnce.calcularPRL(), 0.01f);
    }

    @Test
    void deveRetornarPRLQualityAssuranceJunior() {
        NivelTecnico nivelTecnico = new Junior();
        QualityAssurance qualityAssurnce = new QualityAssurance(1000.0f);
        qualityAssurnce.setNivelTecnico(nivelTecnico);

        assertEquals(1950.0f,qualityAssurnce.calcularPRL(), 0.01f);
    }

    @Test
    void deveRetornarPRLQualityAssurancePleno() {
        NivelTecnico nivelTecnico = new Pleno();
        QualityAssurance qualityAssurnce = new QualityAssurance(1000.0f);
        qualityAssurnce.setNivelTecnico(nivelTecnico);

        assertEquals(2250.0F,qualityAssurnce.calcularPRL(), 0.01f);
    }

    @Test
    void deveRetornarPRLQualityAssuranceSenior() {
        NivelTecnico nivelTecnico = new Senior();
        QualityAssurance qualityAssurnce = new QualityAssurance(1000.0f);
        qualityAssurnce.setNivelTecnico(nivelTecnico);

        assertEquals(3000.0,qualityAssurnce.calcularPRL(), 0.01f);
    }

    @Test
    void deveRetornarPRLQualityAssuranceEspecialista() {
        NivelTecnico nivelTecnico = new Especialista();
        QualityAssurance qualityAssurnce = new QualityAssurance(1000.0f);
        qualityAssurnce.setNivelTecnico(nivelTecnico);

        assertEquals(3750.0,qualityAssurnce.calcularPRL(), 0.01f);
    }
}