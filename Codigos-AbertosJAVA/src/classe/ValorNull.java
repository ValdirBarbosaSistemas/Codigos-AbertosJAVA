package classe;

public class ValorNull {
	public static void main(String[] args) {

		String s1 = "";
		System.out.println(s1.concat("!!!"));
		String s2 = null; 
		// O valor nunca será acessado devido ao valor null. Voce não pode acessar nem atributo ou método que está NULO
		// System.out.println(s2.concat("????"));
		System.out.println(s2);
	}
}
