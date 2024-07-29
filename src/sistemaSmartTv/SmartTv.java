package sistemaSmartTv;
public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;


    public void ligar() {
        ligada = true;
    }
    public void desligar() {
        ligada = false;
    }

    public void canalMais() {
        canal++;
    }
    public void canalMenos() {
        canal--;
    }
    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

    public void volumeMais() {
        volume++;
    }
    public void volumeMenos() {
        volume--;
    }
}
