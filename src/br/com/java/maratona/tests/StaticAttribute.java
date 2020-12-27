package br.com.java.maratona.tests;

import br.com.java.maratona.classes.Carro;

public class StaticAttribute {

    public static void main(String[] args) {

        Carro carro1 = new Carro("Gol", "ds12s51","Volks");

        Carro carro2 = new Carro("Stillo", "ds12s51","Fiat");






        System.out.println(carro1.toString());
        System.out.println(carro2.toString());


        System.out.println("--------------------------");

        Carro.setVelocidadeLimite(500);

        System.out.println(carro1.toString());
        System.out.println(carro2.toString());
    }
}
