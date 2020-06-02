package classe;

public class ProdutoTeste {
	public static void main(String[] args) {

		Produto p1 = new Produto("Notebook", 4.200); // chamando/instanciando um novo 'produto' 
													// atrav�s do construtor
		// p1.nome = "Notebook"; // incluindo o nome no produto 'p1'
		p1.preco = 4.200; // incluindo o preço no produto 'p1'
		Produto.desconto = 0.25; // incluindo o desconto no produto 'p1'

		/*
		 * Os construtores são métodos especiais para a construção de um objeto.
		 * Inicia-se com a primeira letra minúscula e a proxima palavra maiúscula.
		 * Geralmente o nome do construtor é o mesmo nome da classe
		 */
		var p2 = new Produto(); // pode-se criar um objeto utilizando a palavra 'var' também
		p2.nome = "Caneta Preta"; // incluindo o nome no produto 'p2'
		p2.preco = 12.50; // incluindo o preço no produto 'p2'
		Produto.desconto = 0.10; // incluindo o desconto no produto 'p2'

		System.out.println(p1.nome); // acesso ao nome
		System.out.println(p2.nome);

		double precoFinal1 = p1.precoComDesconto(); // geralmente os métodos vem com os parênteses,
		double precoFinal2 = p2.precoComDesconto(); // sem eles é chamado de atributo
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;

		System.out.printf("A média dos produtos é: R$%.2f", mediaCarrinho);

		/*
		 * double precoFinal1 = p1.preco * (1 - p1.desconto); double precoFinal2 =
		 * p2.preco * (1 - p2.desconto); double mediaCarrinho = (precoFinal1 +
		 * precoFinal2) / 2;
		 */
	}
}