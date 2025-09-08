package org.example;

public class ParametrosLoja {

    private ParametrosLoja() {};
    private static ParametrosLoja instance = new ParametrosLoja();
    public static ParametrosLoja getInstance() {
        return instance;
    }

    private String nomeLoja;
    private String razaoSocial;
    private String cnpj;

    public String getNomeLoja() {
        return nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
