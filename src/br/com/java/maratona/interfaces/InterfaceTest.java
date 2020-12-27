package br.com.java.maratona.interfaces;

/**
 * @autor Adriano Rabello
 */
public class InterfaceTest {

    public static void main(String[] args) {

        Produto produto = new Produto("Café", 5.99);

        produto.calcularFrete();
        produto.calcularImposto();

    }
}
