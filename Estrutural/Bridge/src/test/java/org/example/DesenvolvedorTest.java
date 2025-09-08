package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DesenvolvedorTest {

    @Test
    void deveRetornarPRLDsenvolvedorEstagiario() {
        NivelTecnico nivelTecnico = new Estagiario();
        Desenvolvedor desenvolvedor = new Desenvolvedor(1000.0f);
        desenvolvedor.setNivelTecnico(nivelTecnico);

        assertEquals(0,desenvolvedor.calcularPRL(), 0.01f);
    }

    @Test
    void deveRetornarPRLDsenvolvedorJunior() {
        NivelTecnico nivelTecnico = new Junior();
        Desenvolvedor desenvolvedor = new Desenvolvedor(1000.0f);
        desenvolvedor.setNivelTecnico(nivelTecnico);

        assertEquals(2600.0f,desenvolvedor.calcularPRL(), 0.01f);
    }

    @Test
    void deveRetornarPRLDsenvolvedorPleno() {
        NivelTecnico nivelTecnico = new Pleno();
        Desenvolvedor desenvolvedor = new Desenvolvedor(1000.0f);
        desenvolvedor.setNivelTecnico(nivelTecnico);

        assertEquals(3000.0F,desenvolvedor.calcularPRL(), 0.01f);
    }

    @Test
    void deveRetornarPRLDsenvolvedorSenior() {
        NivelTecnico nivelTecnico = new Senior();
        Desenvolvedor desenvolvedor = new Desenvolvedor(1000.0f);
        desenvolvedor.setNivelTecnico(nivelTecnico);

        assertEquals(4000.0,desenvolvedor.calcularPRL(), 0.01f);
    }

    @Test
    void deveRetornarPRLDsenvolvedorEspecialista() {
        NivelTecnico nivelTecnico = new Especialista();
        Desenvolvedor desenvolvedor = new Desenvolvedor(1000.0f);
        desenvolvedor.setNivelTecnico(nivelTecnico);

        assertEquals(5000.0,desenvolvedor.calcularPRL(), 0.01f);
    }
}