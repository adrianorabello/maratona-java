package br.com.java.maratona.classes.varargs;

/**
 * @autor Adriano Rabello
 */
public class VarargsTest {


    public static void main(String[] args) {

        Varargs varargs = new Varargs();

        int[] valores = {1,2,3};

        varargs.soma(valores);
        varargs.somaVarArgs(1,3,2);



    }
}
