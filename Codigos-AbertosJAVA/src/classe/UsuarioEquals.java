package classe;

public class UsuarioEquals {
	String nome;
	String email;

	// Implementando o equals do zero
	public boolean equals(Object objeto) {

		if (objeto instanceof UsuarioEquals) {
			// (Cast de Objeto) pois o equals só faz comparação de objetos
			UsuarioEquals outro = (UsuarioEquals) objeto;

			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email.equals(this.email);

			return nomeIgual && emailIgual;
		} else {
			return false;
		}
	} 

}
