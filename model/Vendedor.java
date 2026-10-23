package model;

public class Vendedor implements Funcionario {

    public void baterPonto(String hora) {
        System.out.println("O gerente bateu ponto às " + hora + "hrs!");
    }
    
    public void realizarVenda(String item) {
        System.out.println("O vendedor vendeu " + item + "!");
    }

    public void abrirCaixa() {
        System.out.println("O vendedor vendeu abriu o caixa!");
    }

    public void fecharCaixa() {
        System.out.println("O vendedor fechou o caixa!");
    }
}