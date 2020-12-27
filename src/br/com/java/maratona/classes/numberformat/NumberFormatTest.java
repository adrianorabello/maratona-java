package br.com.java.maratona.classes.numberformat;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest {

    public static void main(String[] args) {

        float valor = 5560.23f;

        Locale locaBra = new Locale("br");

        NumberFormat[] nfa = new NumberFormat[4];

        nfa[0] = NumberFormat.getInstance();
        nfa[1] = NumberFormat.getInstance(locaBra);
        nfa[2] = NumberFormat.getCurrencyInstance();
        nfa[3] = NumberFormat.getCurrencyInstance(locaBra);

        for (NumberFormat nf :nfa){

            System.out.println(nf.format(valor));
        }



    }
}
