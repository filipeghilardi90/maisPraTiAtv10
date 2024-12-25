package encapsulamento;

public class ProdutoDesconto {
    public static void main(String[] args) {
        Produto produto = new Produto("Notebook", 3000.00, 10);
        System.out.println("Produto criado: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());
        System.out.println("Quantidade: " + produto.getQuantidade());

        // Aplicar um desconto válido
        try {
            produto.aplicarDesconto(20);
            System.out.println("Preço após aplicar desconto de 20%: " + produto.getPreco());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Tente aplicar um desconto inválido para testar a validação
        try {
            produto.aplicarDesconto(60);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
