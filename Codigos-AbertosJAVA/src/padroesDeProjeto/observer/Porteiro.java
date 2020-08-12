package padroesDeProjeto.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {
	// Ele representa o SUBJECT do OBSERVER
	// Criou uma lista para adicionar os observadores do evento
	private List<ObservadorChegadaAniversariante> observadores = new ArrayList<>();

	// Método para registrar os observadores
	public void registrarObservador(ObservadorChegadaAniversariante observador) {
		observadores.add(observador);
	}

	// Iniciar o monitoramento do porteiro
	public void monitorar() {
		Scanner entrada = new Scanner(System.in);

		String valor = "";

		while (!"sair".equalsIgnoreCase(valor)) {
			System.out.println("Aniversariante chegou????");
			valor = entrada.nextLine();

			if ("sim".equalsIgnoreCase(valor)) {
				// Criar o evento
				EventoChegadaAniversariante evento = new EventoChegadaAniversariante(new Date());

				// Notificar os observadores
				observadores.stream().forEach(o -> o.chegou(evento));
				valor = "sair";
			} else {
				System.out.println("ALARME FALSO!!!");
			}
		}
		entrada.close();
	}
}