package streamAPI;

import java.util.Arrays;
import java.util.List;

public class OutrosMetodos {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 6.1);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Gabi", 10);
		Aluno a5 = new Aluno("Ana", 7.1);
		Aluno a6 = new Aluno("Luna", 6.1);
		Aluno a7 = new Aluno("Gui", 8.1);
		Aluno a8 = new Aluno("Gabi", 10);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
		System.out.println("Distinct... NÃO DUPLICAR");
		alunos.stream().distinct().forEach(System.out::println);
		/*
		 * O 'Distinct' serve para não haver duplicação de elementos. No caso dele, para
		 * funcionar tem que se haver o (HashCode ou Equals).
		 */
		System.out.println("\nSkip/Limit - Pular elemento e Limitar até onde queira");
		alunos.stream()
		.distinct()
		.skip(2) // Vai pular 2 elementos
		.limit(2) // Vai mostrar somente 2 elementos
		.forEach(System.out::println);
	}
}
