package org.example;

public class SAC implements Setor {

    private static SAC instancia = new SAC();

    private SAC() {}

    public static SAC getInstancia() {
        return instancia;
    }

    public String receberReclamacao(String mensagem) {
        return "A Empresa vai procurar melhorar o serviço da reclamação: " + mensagem;
    }

    public String receberElogio(String mensagem) {
        return "A Empresa agradece a mensagem: " + mensagem;
    }

    public String receberSugestao(String mensagem) {
        return "A Empresa vai analisar a sugestão: " + mensagem;
    }
}
