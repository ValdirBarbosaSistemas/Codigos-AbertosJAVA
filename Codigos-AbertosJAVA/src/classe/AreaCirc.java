package classe;

public class AreaCirc {
	double raio;
	static double pi = 3.14; //o modificador sempre virá antes do tipo

	// construtor
	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}

	// m�todo
	double area() {
		 return pi * Math.pow(raio, 2); // calculo para elevar o raio a pot�ncia
	 }
}
