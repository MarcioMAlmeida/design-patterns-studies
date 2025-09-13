package org.example;

public class Cliente {

    private String rota;

    public String getRota() {
        return rota;
    }

    public void encontrarRotaMaisCurta() {
        Entrega entrega = new Entrega();
        this.rota = entrega.encontrarRota(new RotaMaisCurta());
    }

    public void encontrarRotaMaisRapida() {
        Entrega entrega = new Entrega();
        this.rota = entrega.encontrarRota(new RotaMaisRapida());
    }

    public void encontrarRotaMenosPedagio() {
        Entrega entrega = new Entrega();
        this.rota = entrega.encontrarRota(new RotaMenosPedagios());
    }
}
