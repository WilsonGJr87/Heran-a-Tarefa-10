package model.ex2;

public class PagamentoCartao implements Pagamento {

    private double valor;

    public PagamentoCartao(double valor) {
        this.valor = valor;
    }

    public void calcularPagamento() {

    }

    public void emitirBoleto() {
        double taxa = (valor * .05);
        System.out.println("======== RECIBO - CARTÃO ========");
        System.out.println("Valor: R$ " + valor);
        System.out.println("Taxa (5%): R$ " + taxa);
        System.out.println("Total: R$ " + (valor + taxa));
    }
}