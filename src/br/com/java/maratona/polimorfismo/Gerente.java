package br.com.java.maratona.polimorfismo;

/**
 * @autor Adriano Rabello
 */
public class Gerente extends Funcionario {

    private double pl;

    public Gerente() {

    }

    public Gerente(String nome, double salaraio, double pl) {
        super(nome, salaraio);
        this.pl = pl;
    }

    @Override
    public void calcularPagamento() {

        this.salario = this.salario + this.pl * 0.2;
    }

    public double getPl() {
        return pl;
    }

    public void setPl(double pl) {
        this.pl = pl;
    }
}
