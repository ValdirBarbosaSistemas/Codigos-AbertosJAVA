package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 6.1);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Gabi", 10);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

		Predicate<Aluno> aprovado = a -> a.nota >= 7; // Função para filtro
		Function<Aluno, Double> apenasNota = a -> a.nota; // Função para mapeamento
		BinaryOperator<Double> somatorio = (a, b) -> a + b; // Função tradicional para o Reduce

		alunos.stream() // Criação da stream
				.filter(aprovado) // Operação intermediária
				.map(apenasNota) // Operação intermediária
				.reduce(somatorio) // Operação terminal
				.ifPresent(System.out::println);
		// Neste caso ele está somando as notas maiores do que '7' e imprime o total.
	}
}
