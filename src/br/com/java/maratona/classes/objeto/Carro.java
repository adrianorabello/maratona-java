package br.com.java.maratona.classes.objeto;

/**
 * @autor Adriano Rabello
 */

public class Carro {

    private String nome;

    private String place;

    public Carro() {

    }

    public void imprime(Carro carro){

        carro.setNome("teste");
        System.out.println("O nome do carro é " + carro.getNome());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
