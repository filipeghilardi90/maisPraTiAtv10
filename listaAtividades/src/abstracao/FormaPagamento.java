package abstracao;

public abstract class FormaPagamento {
    abstract void processarPagamento(double valor);
    abstract boolean validarPagamento();
}
