package br.com.java.maratona.classes.abstrata;

public class RelatorioPagamento {


    public void RelatorioPagamentoGenerico(Funcionario funcionario){

        System.out.println("Funcionario  " + funcionario.getNome());
        System.out.println("Salario  " + funcionario.getSalario()  );
        funcionario.calcularPgamento();

        System.out.println(" Valor a receber " + funcionario.getTotalReceber());

        System.out.println(" -------------------------------------");
    }
}
