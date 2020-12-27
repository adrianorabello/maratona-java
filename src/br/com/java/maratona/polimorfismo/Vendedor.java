package br.com.java.maratona.polimorfismo;

/**
 * @autor Adriano Rabello
 */
public class Vendedor extends Funcionario {

    private double totalvendas;

    public Vendedor() {
    }

    public Vendedor(String nome, double salaraio, double totalvendas) {
        super(nome, salaraio);
        this.totalvendas = totalvendas;
    }

    @Override
    public void calcularPagamento() {

        this.salario = this.salario + this.totalvendas * 0.05;
    }


    public double getTotalvendas() {
        return totalvendas;
    }

    public void setTotalvendas(double totalvendas) {
        this.totalvendas = totalvendas;
    }
}
