package br.com.java.maratona.interfaces;

/**
 * @autor Adriano Rabello
 */
public class Produto implements Tributavel, Transportavel {

    private String nome;
    private double preco;
    private double precoFinal;

    public Produto() {
    }

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.precoFinal = (preco) + preco * IMPOSTO;
    }

    void teste(){

    }

    @Override
    public void calcularImposto() {

        System.out.println("Preço com o imposto " + this.precoFinal);
    }

    @Override
    public void calcularFrete() {
        System.out.println("Calculando o frete " + TAXA_BASICA);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPrecoFinal() {
        return precoFinal;
    }

    public void setPrecoFinal(double precoFinal) {
        this.precoFinal = precoFinal;
    }
}
