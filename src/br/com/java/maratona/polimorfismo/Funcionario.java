package br.com.java.maratona.polimorfismo;

/**
 * @autor Adriano Rabello
 */


public abstract class Funcionario {

    protected  String nome;
    protected double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, double salaraio) {
        this.nome = nome;
        this.salario = salaraio;
    }



    public abstract void calcularPagamento();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalaraio() {
        return salario;
    }

    public void setSalaraio(double salaraio) {
        this.salario = salaraio;
    }
}
