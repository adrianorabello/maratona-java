package br.com.java.maratona.classes.heranca;

public class Funcionaio extends Pessoa {

    private String cargo;



    public Funcionaio(String nome, String cargo){
        // chama o metodo construtor da classe pai
        super(nome);

        this.cargo = cargo;
    }



    @Override
    public String toString() {
        return "Funcionaio{" +
                "Nome: " + this.getNome()+
                " Cargo='" + cargo + '\'' +
                '}';
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
