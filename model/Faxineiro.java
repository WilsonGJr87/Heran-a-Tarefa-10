package model;

public class Faxineiro implements Funcionario {
    public void baterPonto(String hora) {
        System.out.println("O gerente bateu ponto às " + hora + "hrs!");
    }
    
    public void limpar(String lugar) {
        System.out.println("O faxineiro limpou " + lugar + "!");
    }
    public void tomarCafe() {
        System.out.println("O faxineiro tomou café!");
    }
}