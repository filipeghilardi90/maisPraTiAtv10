package abstracao;

public class SistemaPagamentos {
    public static void main(String[] args) {
        FormaPagamento[] pagamentos = {new CartaoCredito(), new Boleto(), new Pix()};

        for (FormaPagamento pagamento : pagamentos) {
            if (pagamento.validarPagamento()) {
                pagamento.processarPagamento(100.0);
            }
        }
    }
}
