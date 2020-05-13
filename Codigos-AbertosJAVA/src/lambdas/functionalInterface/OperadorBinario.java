package lambdas.functionalInterface;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class OperadorBinario {
	public static void main(String[] args) {
		BinaryOperator<Double> media = (n1, n2) -> {
			return (n1 + n2) / 2;
		};
		System.out.println(media.apply(9.8, 5.0));

		/*
		 * Sabemos que no BinaryOperator entra dois valores e sai um resultado. Se por
		 * acaso quisermos colocar uma String para dizer se o aluno foi APROVADO ou se
		 * foi REPROVADO? Daí que usaremos a interface funcional denominada
		 * 'BiFunction'. Pois ela recebe dois valores e retorna uma String.
		 */
		BiFunction<Double, Double, String> resultado = (n1, n2) -> {
			double notaFinal = (n1 + n2) / 2;
			return notaFinal >= 7 ? "Aprovado" : "Reprovado"; // Operador ternário;
		};
		System.out.println(resultado.apply(9.8, 5.0));
	}
}
