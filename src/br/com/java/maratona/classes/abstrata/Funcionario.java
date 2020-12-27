package br.com.java.maratona.classes.abstrata;

public abstract  class Funcionario {

    protected String nome;

    protected double salario;

    protected double totalReceber;




    public Funcionario(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }


    public abstract  void calcularPgamento();


    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getTotalReceber() {
        return totalReceber;
    }

    public void setTotalReceber(double totalReceber) {
        this.totalReceber = totalReceber;
    }
}
