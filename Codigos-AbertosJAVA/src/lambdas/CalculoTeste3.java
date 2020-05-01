package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
	public static void main(String[] args) {
		// Exemplo de Interface funcional

		/*
		 * O Java não permite esse tipo de conversão direta. Neste caso não se pode
		 * fazer int -> Double ou double -> Double
		 */
		BinaryOperator<Double> calc = (x, y) -> {
			return x + y;
		};
		System.out.println(calc.apply(2.0, 3.0));

		calc = (x, y) -> x * y;
		System.out.println(calc.apply(2.0, 3.0));

		// Neste caso para se usar valores do tipo int, tem que se colocar a classe
		// INTEGER
		BinaryOperator<Integer> calc2 = (x, y) -> {
			return x + y;
		};
		System.out.println(calc2.apply(2, 3));

		calc = (x, y) -> x * y;
		System.out.println(calc2.apply(2, 3));

	}
}
