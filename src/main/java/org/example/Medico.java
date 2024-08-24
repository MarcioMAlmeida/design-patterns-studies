package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Medico implements Iterable<Paciente> {

    public List<Paciente> pacientes = new ArrayList<Paciente>();

    public Medico(Paciente... pacientes) {
        this.pacientes = Arrays.asList(pacientes);
    }

    @Override
    public Iterator<Paciente> iterator() {
        return pacientes.iterator();
    }

}
