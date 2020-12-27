package br.com.java.maratona.classes;


public class Carro {

    private String nome;
    private String placa;
    private String marca;


    private static int velocidadeLimite = 240;


    {
        int array[] = {1,2,3};
        for (int x :array ){
            System.out.println(x + "\n");     }
    }




    public Carro(String nome, String placa, String marca){

        this.nome = nome;
        this. placa = placa;
        this.marca = marca;
    }


    public static int getVelocidadeLimite() {
        return velocidadeLimite;
    }

    public static void setVelocidadeLimite(int velocidadeLimite) {
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }


    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                 " \n Velocidade limite " + velocidadeLimite +
                '}';
    }
}
