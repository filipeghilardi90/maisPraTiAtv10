package heranca;

public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return this.salario * 0.1;
    }

    @Override
    public void trabalhar() {
        System.out.println("Desenvolvedor " + nome + " está escrevendo código.");
    }
}
