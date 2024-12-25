package abstracao;

import java.util.ArrayList;
import java.util.List;

public class GestaoFuncionarios {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Gerente("Ana", 10000.00));
        funcionarios.add(new Desenvolvedor("Carlos", 5000.00));
        funcionarios.add(new Estagiario("Beatriz", 2000.00));

        double totalFolha = calcularFolhaPagamento(funcionarios);
        System.out.println("Total da folha de pagamento: " + totalFolha);

        // Promover estagiário a desenvolvedor
        Funcionario estagiario = funcionarios.get(2);
        Funcionario novoDesenvolvedor = new Desenvolvedor(estagiario.getNome(), estagiario.getSalario() + 1000);
        funcionarios.set(2, novoDesenvolvedor);

        totalFolha = calcularFolhaPagamento(funcionarios);
        System.out.println("Total da folha de pagamento após promoção: " + totalFolha);
    }

    public static double calcularFolhaPagamento(List<Funcionario> funcionarios) {
        double total = 0;
        for (Funcionario funcionario : funcionarios) {
            total += funcionario.calcularSalario() + funcionario.calcularBonus();
        }
        return total;
    }
}
