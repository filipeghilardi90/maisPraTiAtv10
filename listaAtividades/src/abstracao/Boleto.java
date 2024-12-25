package abstracao;

public class Boleto extends FormaPagamento {
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando pagamento de " + valor + " via boleto.");
    }

    @Override
    public boolean validarPagamento() {
        System.out.println("Validando pagamento com boleto.");
        return true;
    }
}
