package abstracao;

public class CartaoCredito extends FormaPagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento de " + valor + " no cartão de crédito.");
    }

    @Override
    public boolean validarPagamento() {
        System.out.println("Validando pagamento com cartão de crédito.");
        return true;
    }
}
