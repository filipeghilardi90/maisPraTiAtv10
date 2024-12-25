package abstracao;

public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public abstract double calcularSalario();
    public abstract double calcularBonus();

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
}
