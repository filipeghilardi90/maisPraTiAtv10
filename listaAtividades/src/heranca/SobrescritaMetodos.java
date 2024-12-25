package heranca;

public class SobrescritaMetodos {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Ana", 10000.00);
        Funcionario desenvolvedor = new Desenvolvedor("Carlos", 5000.00);

        gerente.trabalhar();
        desenvolvedor.trabalhar();
    }
}
