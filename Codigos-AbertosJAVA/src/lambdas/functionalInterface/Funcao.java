package lambdas.functionalInterface;

import java.util.function.Function;

public class Funcao {
	public static void main(String[] args) {

		/*
		 * Na interface funcional FUNCTION, ele é um 'Generics' que recebe como entrada
		 * um Integer e retorna uma String. OBS2: Ele está sendo usado uma operação
		 * ternária para dizer se é PAR ou ÍMPAR.
		 */
		Function<Integer, String> parOuImpar = (numero) -> numero % 2 == 0 ? "Par" : "Impar";
		System.out.println(parOuImpar.apply(33));

		/*
		 * Na interface funcional há uma função que 'une' as funções criadas... Esta
		 * função faz uma 'concatenação de funções' que chamamos de COMPOSIÇÃO DE
		 * FUNÇÃO. O nome desta função é 'andThen' que significa 'E então chame a
		 * função...', ou seja, ele chama outra função para trabalhar de forma conjunta.
		 */
		Function<String, String> oResultadoE = valor -> "O Resultado é: " + valor;

		Function<String, String> empolgado = valor -> valor + "\nUhuuuu doidera!!!";
		String resultadoFinal = parOuImpar.andThen(oResultadoE).andThen(empolgado).apply(32);

		System.out.println(resultadoFinal);
	}
}
