package org.example;

public class MoedaAdapter extends Dollar {

    private IMoeda real;

    public MoedaAdapter(IMoeda real) {
        this.real = real;
    }

    public float recuperarSaldoReal() {
        real.setValor((float) (this.getValorDollar()/5.48));
        return real.getValor();
    }

    public void salvarSaldoDollar() {
        this.setValorDollar((float) ((real.getValor())*5.48));
    }
}
