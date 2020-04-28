package classe;

public class PrimeiroTrauma {

	int a = 3;
	static int b = 4; // outra maneira de ter acesso é criar uma variavel estática

	public static void main(String[] args) {
		PrimeiroTrauma p = new PrimeiroTrauma();/*
											     * para se ter acesso atraves da variável a, deve-se chamar 
												 * criando uma instancia.
												 */
		System.out.println(p.a);
		System.out.print(b); // tendo acesso devido a criacao do metodo estatico na variavel B

	}
}