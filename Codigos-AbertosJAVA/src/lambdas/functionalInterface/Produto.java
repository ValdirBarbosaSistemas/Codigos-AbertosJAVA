package lambdas.functionalInterface;

public class Produto {
	final String nome;
	final double preco;
	final double desconto;

	// Construtor

	public Produto(String nomeProduto, double precoProduto, double descontoProduto) {
		this.nome = nomeProduto;
		this.preco = precoProduto;
		this.desconto = descontoProduto;
	}
}
