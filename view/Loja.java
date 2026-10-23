package view;
import model.ex2.*;

public class Loja {
    public static void main(String[] args) {

        PagamentoCartao cartao = new PagamentoCartao(12);
        PagamentoDinheiro dinheiro = new PagamentoDinheiro(15);

        cartao.calcularPagamento();
        cartao.emitirBoleto();

        System.out.println("================================");
        
        dinheiro.calcularPagamento();
        dinheiro.emitirBoleto();

    }
}