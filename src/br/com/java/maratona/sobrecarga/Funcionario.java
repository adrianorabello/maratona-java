package br.com.java.maratona.sobrecarga;

/**
 * @autor Adriano Rabello
 */
public class Funcionario {

    private String nome;
    private String cpf;
    private String rg;

    public Funcionario(){

    }

    public Funcionario(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    /** @Modificardor de acesso é o mesmo nome do método mas com as quantidade de parametros diferentes ou vlores diferentes*/
    public Funcionario(String nome, String cpf, String rg){
        this(nome,cpf);
        this.rg = rg;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.rg);
    }


    public String getNome() {

        System.out.println("dentro do get nome");
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
}
