package org.example;

import java.util.Iterator;

public class Tratamento {

    public static Integer contarPacientesEmTratamento(Medico medico) {
        int contador = 0;
        for(Paciente paciente : medico) {
            if(paciente.isEmTratamento()) {
                contador++;
            }
        }
        return contador;
    }

    public static Integer contarPacientes(Medico medico) {
        int contador = 0;
        for(Iterator a = medico.iterator(); a.hasNext();) {
            contador++;
            a.next();
        }
        return contador;
    }
}
