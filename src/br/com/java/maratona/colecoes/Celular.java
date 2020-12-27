package br.com.java.maratona.colecoes;

/**
 * @autor Adriano Rabello
 */
public class Celular {

    private String nome;
    private String IMEI;

    public Celular() {
    }

    public Celular(String nome, String IMEI) {
        this.nome = nome;
        this.IMEI = IMEI;
    }

    public String getNome() {
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }
}
