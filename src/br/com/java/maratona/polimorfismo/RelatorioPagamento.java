package br.com.java.maratona.polimorfismo;

/**
 * @autor Adriano Rabello
 */
public class RelatorioPagamento {

    public void ralatoriopagamentoGenrerico(Funcionario funcionario){
        funcionario.calcularPagamento();
        System.out.println("Emitindo relatorio pagamento ");
        System.out.println("Nome do funcionario " + funcionario.getNome());
        System.out.println("Salario " + funcionario.getSalaraio());
        System.out.println(" ---------------------------------------------------------------");
    }
}
