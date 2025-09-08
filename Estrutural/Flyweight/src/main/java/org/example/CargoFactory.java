package org.example;

import java.util.HashMap;
import java.util.Map;

public class CargoFactory {

    private static Map<String, Cargo> cargos = new HashMap<>();

    public  static Cargo getCargo(String nomeCargo) {
        Cargo cargo = cargos.get(nomeCargo);
        if (cargo == null) {
            cargo = new Cargo(nomeCargo);
            cargos.put(nomeCargo, cargo);
        }
        return cargo;
    }

    public static int getTotalCargos() {
        return cargos.size();
    }

}
