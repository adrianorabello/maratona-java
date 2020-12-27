package br.com.java.maratona.classes.enumeracao;

public enum TipoCliente {

    PESSOA_FISICA(1,"Pessoa fisica"),
    PESSOA_JURIDICA(2,"Pessoa Juridica");

    TipoCliente(int tipo, String nome) {
        this.tipo = tipo;
        this.nome = nome;
    }

    private int tipo;
    private String nome;


    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
