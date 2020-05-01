package lambdas;

@FunctionalInterface // A anottation serve para validar algo
public interface Calculo {
	double executar(double a, double b);
	// double teste();

	/*
	 * A interface funcional (@FunctionalInterface) só é válida em apenas UMA
	 * EXPRESSÃO DE MÉTODO. Se for mais de uma dá erro. ISSO É, SE
	 * A @FunctionalInterface FOR CHAMADA. OBS 2 - CASO VOCE QUEIRA DEFINIR LAMBDAS
	 * NA INTERFACE É NECESSÁRIO USAR O @FunctionalInterface
	 */
	// É possível colocar em uma interface um método do tipo DEFAUT e também STATIC
}
