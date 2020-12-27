package br.com.java.maratona.classes.varargs;

/**
 * @autor Adriano Rabello
 */
public class Varargs {

    public void soma(int[] numeros){

        int soma = 0;

        for (int n : numeros){
            soma += n;
        }

        System.out.println(soma);
    }

//    Pode receber os valores com virgulas
    public void somaVarArgs(int... numeros){

        int soma = 0;

        for (int n : numeros){
            soma += n;
        }

        System.out.println(soma);
    }


}
