package model.ex2;

public class PagamentoDinheiro implements Pagamento {

    private double valor;

    public PagamentoDinheiro(double valor) {
        this.valor = valor;
    }

    public void calcularPagamento() {
        double v = valor - (valor * .1);

        System.out.println("O valor do pagamento é: " + v);
    }

    public void emitirBoleto() {
        double desconto = (valor * .1);
        System.out.println("======== RECIBO - DINHEIRO ========");
        System.out.println("Valor: R$ " + valor);
        System.out.println("Desconto (10%): R$ " + desconto);
        System.out.println("Total: R$ " + (valor - desconto));
    }
}