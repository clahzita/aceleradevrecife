package models;

public class Carro {

    private String modelo;
    private int ano;

    public  Carro(){
        System.out.println("Construtor de carro executado");
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
