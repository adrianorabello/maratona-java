package br.com.java.maratona.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @autor Adriano Rabello
 */


abstract  class Animal{

    abstract void consulta();
}

class Cachorro extends Animal {

    @Override
    void consulta() {

        System.out.println("consultando cachorro ");
    }
}

class Gato extends Animal {

    @Override
    void consulta() {

        System.out.println("consultando gato ");
    }
}


public class WildCard {


    public static void main(String[] args) {

        Cachorro[] cachoros = {new Cachorro(), new Cachorro()};
        Gato[] gatos = {new Gato(), new Gato()};
        consultarAnimais(cachoros);
        consultarAnimais(gatos);

        /** em arrays podemos colocar as classes que estendem animal */
        Animal[] animais2 = {new Cachorro(), new Gato()};

        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Gato());
        animalList.add(new Cachorro());

        consultarAnimaisList(animalList);

    }

    public static void consultarAnimais(Animal[] animais){

        for (Animal animal: animais){

            animal.consulta();
        }
    }

    /** posso receber qualquer sub classe que extend de animal, mas não consigo adicionar naada na lista */
    public static void consultarAnimaisList(List<? extends Animal> animais){

        for (Animal animal: animais){

            animal.consulta();
        }

        /** não posso adicionar nada na lista*/
        //animais.add(new Cachorro());
    }
}
