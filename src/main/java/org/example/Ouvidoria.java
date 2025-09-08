package org.example;

public class Ouvidoria {

    private static Ouvidoria instancia = new Ouvidoria();

    private Ouvidoria() {}

    public static Ouvidoria getInstancia() {
        return instancia;
    }

    public String enviarElogio(String mensagem) {
        return "A Ouvidoria agradece seu contato.\n"+
                "O SAC respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + SAC.getInstancia().receberElogio(mensagem);
    }

    public String enviarReclamacao(String mensagem) {
        return "A Ouvidoria agradece seu contato.\n"+
                "O SAC respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + SAC.getInstancia().receberReclamacao(mensagem);
    }

    public String enviarSugestao(String mensagem) {
        return "A Ouvidoria agradece seu contato.\n"+
                "O SAC respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + SAC.getInstancia().receberSugestao(mensagem);
    }
}
