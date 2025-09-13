package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmpresaTest {

    @Test
    void deveRetornarFuncionarios() {
        Empresa empresa = new Empresa();
        empresa.contratarFuncionario("Marcio","Programador");
        empresa.contratarFuncionario("Bruno","Programador");
        empresa.contratarFuncionario("Dedei","Programador");
        empresa.contratarFuncionario("Will","Vigia");

        List<String> saida = Arrays.asList(
                "Funcionario{nome='Marcio', cargo='Programador'}",
                "Funcionario{nome='Bruno', cargo='Programador'}",
                "Funcionario{nome='Dedei', cargo='Programador'}",
                "Funcionario{nome='Will', cargo='Vigia'}");

        assertEquals(saida, empresa.getFuncionarios());
    }

    @Test
    void deveRetornarTotalCargos() {
        Empresa empresa = new Empresa();
        empresa.contratarFuncionario("Marcio","Programador");
        empresa.contratarFuncionario("Bruno","Programador");
        empresa.contratarFuncionario("Dedei","Programador");
        empresa.contratarFuncionario("Will","Vigia");

        assertEquals(2,CargoFactory.getTotalCargos());
    }
}