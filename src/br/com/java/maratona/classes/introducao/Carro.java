package br.com.java.maratona.classes.introducao;

/**
 * @autor Adriano Rabello
 */
public class Carro {

    private String nome;
    private String placa;


    public Carro(){

    }

    public void imprime(){
        System.out.println(this.getNome());
        System.out.println(this.getPlaca());
    }

    public Carro(String nome ,String placa){
        this.nome = nome;
        this.placa = placa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPalca(String placa) {
        this.placa = placa;
    }
}
