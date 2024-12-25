package encapsulamento;

public class ProdutoSimples {
    public static void main(String[] args) {
        Produto produto = new Produto("Notebook", 3000.00, 10);
        System.out.println("Produto criado: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());
        System.out.println("Quantidade: " + produto.getQuantidade());

        // Tente definir um preço negativo para testar a validação
        produto.setPreco(-100.00);
        System.out.println("Novo preço (após tentativa de definir valor negativo): " + produto.getPreco());

        // Tente definir uma quantidade negativa para testar a validação
        produto.setQuantidade(-5);
        System.out.println("Nova quantidade (após tentativa de definir valor negativo): " + produto.getQuantidade());
    }
}
