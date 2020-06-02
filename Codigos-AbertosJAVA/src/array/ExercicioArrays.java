package array;

import java.util.Arrays;

public class ExercicioArrays {
	public static void main(String[] args) {
		double[] notasAlunoA = new double[3];
		notasAlunoA[0] = 7.9; // criacao de um array tipo fixo
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;

		// Arrays.toString(notasAlunoA); Importou a biblioteca Arrays e usou seu método
		// (toString)
		// System.out.println(notasAlunoA[1]);
		System.out.println(Arrays.toString(notasAlunoA));

		// Criou uma variavel 'total' para percorrer um array e dizer a média
		double totalAlunoA = 0;
		for (int i = 0; i < notasAlunoA.length; i++) { // outra maneira de percorrer é ver o tamanho pelo length
			totalAlunoA += notasAlunoA[i];

		}
		System.out.println(totalAlunoA / notasAlunoA.length);

		// outra maneira de fazer um array
		double notasAlunoB[] = { 9.0, 7.2, 6.9, 5.5 }; // Não precisa dizer o tamanho do array, pois é dinâmico

		double totalAlunoB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];
		}
		System.out.println(totalAlunoB / notasAlunoB.length);
	}
}
