package orientacaoObjeto.heranca.desafio;

public class CarroFinal {
    public static void main(String[] args) {
        Carro c1 = new Civic();
        c1.acelerar();
        System.out.println(c1);

        //Carro c2 = new Ferrari(); TAMBÉM PODE SE FAZER DESSE TIPO
        Ferrari c2 = new Ferrari(400);
        c2.acelerar();
        System.out.println(c2);
    }
}
