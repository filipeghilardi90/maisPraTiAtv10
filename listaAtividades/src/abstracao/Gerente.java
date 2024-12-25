package abstracao;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularSalario() {
        return salario;
    }

    @Override
    public double calcularBonus() {
        return salario * 0.2;
    }
}

