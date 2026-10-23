package model;

public class Gerente implements Funcionario {
    
    public void baterPonto(String hora) {
        System.out.println("O gerente bateu ponto às " + hora + "hrs!");
    }
    
    public void abrirLoja() {
        System.out.println("O gerente abriu a loja!");
    }
    public void fecharLoja() {
        System.out.println("O gerente fechou a loja!");
    }

}