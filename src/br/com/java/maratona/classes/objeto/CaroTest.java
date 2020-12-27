package br.com.java.maratona.classes.objeto;

/**
 * @autor Adriano Rabello
 */
public class CaroTest {

    public static void main(String[] args) {

        Carro carro = new Carro();
        carro.setNome("Stilo ");
        carro.setPlace("DXS1463");

        carro.imprime(carro);

        System.out.println(carro.getNome());


    }
}
