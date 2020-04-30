package orientacaoObjeto.abstrato;

public class Cachorro extends Mamífero {

	@Override
	public String mover() {
		return "Usando as patas";
	}

	@Override
	public String mamar() {
		return "Usando leite";
	}
}
