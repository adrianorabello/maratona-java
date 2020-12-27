package br.com.java.maratona.interfaces;

/**
 * @autor Adriano Rabello
 *
 * Todos os metodos de uma itnerface são publicos e abstratos
 * todos os atributos de uma interface são constantes e é orpigatorio inniializa-los
 */

public interface Tributavel {

    /** todos os atributos da interface são estaticos e devem ser inicializados */
    public static final double IMPOSTO = 0.3d;

    void calcularImposto();
}
