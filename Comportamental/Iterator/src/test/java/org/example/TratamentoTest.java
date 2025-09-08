package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TratamentoTest {

    @Test
    void deveContarPacientesAtivosMedico() {
        Medico medico = new Medico(
                new Paciente("Marcio", true),
                new Paciente("Will", false),
                new Paciente("Dedei", false),
                new Paciente("Vitin", false)
        );
        assertEquals(1, Tratamento.contarPacientesEmTratamento(medico));
    }

    @Test
    void deveContarTotalPacientesMedico() {
        Medico medico = new Medico(
                new Paciente("Marcio", true),
                new Paciente("Will", false),
                new Paciente("Dedei", false),
                new Paciente("Vitin", false)
        );
        assertEquals(4, Tratamento.contarPacientes(medico));
    }
}