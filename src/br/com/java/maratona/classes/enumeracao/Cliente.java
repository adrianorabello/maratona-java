package br.com.java.maratona.classes.enumeracao;



public class Cliente {

    private String nome;

    private TipoCliente tipoCliente;



    Cliente(String nome, TipoCliente tipo){

        this.nome = nome;
        this.tipoCliente = tipo;
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente.getNome() +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
}
