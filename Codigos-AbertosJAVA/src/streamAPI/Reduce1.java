package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {
	public static void main(String[] args) {
		/*
		 * O Reduce serve para transformar uma stream de dados em uma outra coisa
		 * totalmente diferente. Pode transformar uma stream de objetos em um array como
		 * exemplo. Ele também faz um somatório dos elementos como exemplo.
		 */
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		/*
		 * Ele recebe como parâmetro um 'acumulador' e o segundo é um elemento de um
		 * número qualquer como exemplo abaixo.
		 */
		BinaryOperator<Integer> soma = (total, n) -> total + n;

		int total1 = nums.stream().reduce(soma).get(); // Com a função GET voce pega o valor que vai ser gerado
		System.out.println(total1);
		/*
		 * Diferente do map e filter que são funções intermediárias, o reduce é uma
		 * funçao TERMINAL, ou seja, depois do reduce voce não tem como chamar outra
		 * stream. No reduce por padrão para se pegar um valor de maneira mais 'segura',
		 * ele usa o tipo 'Integer', e devido a isso, voce tem como utilizar com os
		 * tipos primitivos também, basta colocar a palavra 'GET' que ele irá converter
		 * para o tipo INTEGER, e com isso o reduce tem como parâmetro o modelo
		 * 'OPTIONALINTEGER' que automaticamente ele irá gerar um valor inteiro através
		 * do método get. O Reduce recebe um BinaryOperator como interface funcional. 
		 * (VER A TABELA DAS INTEFACES FUNCIONAIS PARA VER COMO FUNCIONA).Vejamos 
		 * outro exemplo abaixo.
		 */

		Integer total2 = nums.stream().reduce(100, soma);
		System.out.println(total2);
		/*
		 * Neste caso como não está sendo usado o método get, é só colocar o valor
		 * inicial como parmâmetro que ele irá calcular o valor como inteiro.
		 */

		// Resultado foi um Optional<Integer>...
		nums.stream().filter(n -> n > 5).reduce(soma).ifPresent(System.out::println);
		/*
		 * Neste caso, como não foi passado nenhum valor inicial no reduce, ele na forma
		 * do reduce (OPTIONALINTEGER) ele tem uma função chamada 'ifPresent', que
		 * condiciona o valor caso ele esteja presente para mostrar no console.
		 */
	}
}