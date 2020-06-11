package generics;

public class Caixa<TIPO> {
	/*
	 * Agora com Generics, vamos colocar um tipo genérico mas que não vai ser
	 * Inicializado/Definido agora dentro da classe, será inicializado depois...
	 * Para isso, basta colocarmos o sinal de '<>' ao lado da classe e também um
	 * NOME QUALQUER DE SUA PREFERÊNCIA.
	 */
	private TIPO coisa;

	// Set
	public void guardar(TIPO coisa) {
		this.coisa = coisa;
	}

	// Get
	public TIPO abrir() {
		return coisa;
	}
	// Basicamente o que temos aqui é get e set

}
