package br.com.java.maratona.polimorfismo;

/**
 * @autor Adriano Rabello
 */
public class Teste {


    public static void main(String[] args) {

        Vendedor vendedor = new Vendedor("Vendedor ", 1000, 1000);
        Gerente gerente = new Gerente("Gerente ", 1000, 1000);

        RelatorioPagamento relatorioPagamento = new RelatorioPagamento();
        relatorioPagamento.ralatoriopagamentoGenrerico(vendedor);
        relatorioPagamento.ralatoriopagamentoGenrerico(gerente);

        GenericDAO dao = new ArquivoDAOImpl();
        dao.save();

    }
}
