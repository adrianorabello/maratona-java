package br.com.java.maratona.classes.abstrata;



public class Vendedor extends Funcionario {

    private double totalVendas;



    public Vendedor(String nome, double salario, double totalVendas) {
        super(nome, salario);

        this.totalVendas = totalVendas;

    }

    @Override
    public void calcularPgamento() {

        this.totalReceber = (this.totalVendas* 0.2) + this.salario;


    }


    @Override
    public String toString() {
        return "Vendedor{" +
                "totalVendas=" + totalVendas +
                ", nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }


}
