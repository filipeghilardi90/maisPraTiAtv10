import encapsulamento.ProdutoSimples;
import encapsulamento.ProdutoDesconto;
import heranca.HierarquiaFuncionario;
import heranca.SobrescritaMetodos;
import polimorfismo.PolimorfismoInterfaces;
import polimorfismo.PolimorfismoAbstrato;
import abstracao.SistemaPagamentos;
import abstracao.GestaoFuncionarios;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 9) {
            System.out.println("Escolha o exercício para executar:");
            System.out.println("1. Criação de uma Classe Simples");
            System.out.println("2. Melhorando a Classe com Validação");
            System.out.println("3. Criação de uma Hierarquia de Classes");
            System.out.println("4. Sobrescrita de Métodos");
            System.out.println("5. Polimorfismo com Interfaces");
            System.out.println("6. Polimorfismo com Classes Abstratas");
            System.out.println("7. Abstração em um Sistema de Pagamentos");
            System.out.println("8. Sistema de Gestão de Funcionários");
            System.out.println("9. Sair");

            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
            } else {
                opcao = -1; // Valor inválido
                scanner.next(); // Limpa a entrada inválida
            }
            scanner.nextLine(); // Consome a nova linha

            switch (opcao) {
                case 1:
                    ProdutoSimples.main(new String[]{});
                    break;
                case 2:
                    ProdutoDesconto.main(new String[]{});
                    break;
                case 3:
                    HierarquiaFuncionario.main(new String[]{});
                    break;
                case 4:
                    SobrescritaMetodos.main(new String[]{});
                    break;
                case 5:
                    PolimorfismoInterfaces.main(new String[]{});
                    break;
                case 6:
                    PolimorfismoAbstrato.main(new String[]{});
                    break;
                case 7:
                    SistemaPagamentos.main(new String[]{});
                    break;
                case 8:
                    GestaoFuncionarios.main(new String[]{});
                    break;
                case 9:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}


