package fundamentos;

public class InferenciaDeTipos {
	public static void main(String[] args) {
		double a = 4.5; // TIPO DOUBLE
		System.out.println(a);
		
		var b = 4.5; // TIPO DOUBLE
		System.out.println(b);
		
		var c = "Isso � um texto"; // TIPO STRING
		System.out.println(c);
		
		c = "Outro texto"; // TIPO STRING
		System.out.println(c);
		
		//c = 4.5; //N�o pode fazer isso, pois est� 'quebrando a infer�ncia de tipos';
		
		/* Ou seja, o que � INFER�NCIA? Infer�ncia � tudo aquilo que voce pode declarar sem
		 * precisar de dizer o tipo da vari�vel. Ela vai saber de acordo com o tipo que voce
		 * colocar na atribui��o do valor.
		 */
	}
}
