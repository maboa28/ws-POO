package entidadesAula7;

public class Percusso {
    private int avião;
    private int carro;
    private int ônibus;

    public Percusso(int avião, int carro, int ônibus) {
        this.avião = avião;
        this.carro = carro;
        this.ônibus = ônibus;
    }

    public int getAvião() {
        return avião;
    }

    public int getCarro() {
        return carro;
    }

    public int getÔnibus() {
        return ônibus;
    }
}
