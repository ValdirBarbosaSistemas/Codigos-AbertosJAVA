package lambdas;

public class CalculoTeste2 {

	public static void main(String[] args) {

		// Função lambda
		Calculo calc = (x, y) -> {
			return x + y;
		};
		System.out.println(calc.executar(2, 3));

		/*
		 * Outra forma de fazer lambda é SEM A INCLUSÃO DA PALAVRA 'RETURN', basta não
		 * colocar as chaves '{}', pois ele automaticamente irá retornar o valor. ISSO
		 * SÓ É VÁLIDO EM APENAS UMA ÚNICA SENTENÇA DE CÓDIGO, POIS SE FOR MAIS DE UMA
		 * DÁ ERRO E É NECESSÁRIO COLOCAR AS CHAVES.
		 */
		calc = (x, y) -> x * y;
		System.out.println(calc.executar(2, 3));
	}
}
