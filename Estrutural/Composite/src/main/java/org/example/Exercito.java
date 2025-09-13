package org.example;

public class Exercito {

    private Militar tropa;

    public void setTropa(Militar tropa) {
        this.tropa = tropa;
    }

    public String getTropa() {
        if (this.tropa == null) {
            throw new NullPointerException("Exercito sem tropas");
        }
        return this.tropa.getMilitar();
    }
}
