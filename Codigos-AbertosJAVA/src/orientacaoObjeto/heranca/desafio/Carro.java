package orientacaoObjeto.heranca.desafio;

public class Carro {
    int velocidadeAtual;

    //Métodos
    void acelerar() {
        velocidadeAtual += 5;
    }

    void frear() {
        if (velocidadeAtual >= 5) {
            velocidadeAtual -= 5;
        } else {
            velocidadeAtual = 0;
        }
    }

    public String toString() {
        return "A velocidade atual é: " + velocidadeAtual;
    }
}
