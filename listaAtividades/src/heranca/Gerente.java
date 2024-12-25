package heranca;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return this.salario * 0.2;
    }

    @Override
    public void trabalhar() {
        System.out.println("Gerente " + nome + " está gerenciando a equipe.");
    }
}
