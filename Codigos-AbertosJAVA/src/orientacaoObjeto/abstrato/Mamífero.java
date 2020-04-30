package orientacaoObjeto.abstrato;

public abstract class Mamífero extends Animal {

	@Override
	public String mover() {
		return "Usando as patas";
	}
	
	public abstract String mamar();
}
