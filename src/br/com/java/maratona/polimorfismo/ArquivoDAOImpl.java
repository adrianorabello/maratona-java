package br.com.java.maratona.polimorfismo;

/**
 * @autor Adriano Rabello
 */
public class ArquivoDAOImpl  implements GenericDAO{


    @Override
    public void save() {
        System.out.println("Salvando arquivo");
    }
}
