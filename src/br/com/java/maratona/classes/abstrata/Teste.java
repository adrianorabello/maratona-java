package br.com.java.maratona.classes.abstrata;

public class Teste {

    public static void main(String[] args) {

        Vendedor vendor = new Vendedor("Adriano", 2000, 100);

        RelatorioPagamento rel = new RelatorioPagamento();

        rel.RelatorioPagamentoGenerico(vendor);

        Funcionario funcionario = new Vendedor("adiano", 2000, 1000);

        System.out.println(funcionario.getNome());

    }
}
