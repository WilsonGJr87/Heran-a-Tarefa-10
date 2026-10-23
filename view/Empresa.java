package view;
import model.ex1.*;

public class Empresa {
    public static void main(String[] args) {

        Gerente gerente = new Gerente();
        Vendedor vendedor = new Vendedor();
        Faxineiro faxineiro = new Faxineiro();

        gerente.abrirLoja();
        gerente.fecharLoja();

        System.out.println("=============================");

        vendedor.abrirCaixa();
        vendedor.fecharCaixa();

        System.out.println("=============================");

        faxineiro.limpar("casa do Viniccius");
        faxineiro.tomarCafe();

        System.out.println("=============================");

        gerente.baterPonto("5");
        vendedor.baterPonto("5");
        faxineiro.baterPonto("5");

    }
}