package br.com.java.maratona.streams;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @autor Adriano Rabello
 */


public class Pessoa {

    private String nome;
    Integer idade;

    public Pessoa(){

    }

    public Pessoa(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public static Stream<Integer> INTEGER_STREAM(){

        return Stream.of(1,2,3);
    }


    public static List<Pessoa> PESSOAS(){

       return Arrays.asList(new Pessoa("adriano", 32), new Pessoa("Aline", 34), new Pessoa("Clara", 5));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
