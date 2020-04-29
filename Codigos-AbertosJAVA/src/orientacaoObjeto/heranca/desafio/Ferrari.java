package orientacaoObjeto.heranca.desafio;

public class Ferrari extends Carro {

	Ferrari() {
		this(315);
		/*
		 * Seja mais interessante assim, pois desse modo voce pode ter outro tipo de
		 * inicialização. Ou seja, por padrão será 315 se não falar nada
		 */
	}

	Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
	}

	@Override
	void acelerar() {
		velocidadeAtual += 15;
	}
}
