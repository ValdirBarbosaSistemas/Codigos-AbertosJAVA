package orientacaoObjeto.heranca;

public class Jogador {
    int vida = 100;
    int x;
    int y;

    //Construtor modificado para se ter o acesso através do SUPER
    Jogador(int x, int y) {
        this.x = x;
        this.y = y;
    }

    boolean atacar(Jogador oponente) {
        int deltaX = Math.abs(x - oponente.x); //Math.abs 'ele ta fazendo o valor absoluto (Ex. -1 ele vai dar 1)'
        int deltaY = Math.abs(y - oponente.y);

        if (deltaX == 0 && deltaY == 1) {
            oponente.vida -= 10;
            return true;
        } else if (deltaX == 1 && deltaY == 0) {
            oponente.vida -= 10;
        } else {
            return true;
        }
        return false;
    }

    boolean andar(Direcao direcao) {

        switch (direcao) {
            case NORTE:
                y--;
                break;
            case LESTE:
                x++;
                break;
            case SUL:
                y++;
                break;
            case OESTE:
                x--;
                break;
        }

        /*
         * if (direcao == Direcao.norte) { x++; }
         */
        return true;
    }
}
