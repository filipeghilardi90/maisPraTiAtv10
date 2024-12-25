package heranca;

public class HierarquiaFuncionario {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Ana", 10000.00);
        Funcionario desenvolvedor = new Desenvolvedor("Carlos", 5000.00);

        System.out.println("Gerente: " + gerente.getNome() + ", Salário: " + gerente.getSalario() + ", Bônus: " + gerente.calcularBonus());
        System.out.println("Desenvolvedor: " + desenvolvedor.getNome() + ", Salário: " + desenvolvedor.getSalario() + ", Bônus: " + desenvolvedor.calcularBonus());
    }
}
