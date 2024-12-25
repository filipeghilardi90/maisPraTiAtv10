package abstracao;

public class Pix extends FormaPagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento de " + valor + " via Pix.");
    }

    @Override
    public boolean validarPagamento() {
        System.out.println("Validando pagamento com Pix.");
        return true;
    }
}
