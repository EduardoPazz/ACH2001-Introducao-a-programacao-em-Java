package ex01;

class Retangulo extends Poligono implements Figura2D {
    private byte A = 0;
    private byte B = 1;

    double[] lados;

    Retangulo(double ladoA, double ladoB) {
        lados = { ladoA, ladoB };
        calculaArea();
        calculaPerimetro();
    }

    public double calculaArea() {
        area = lados[A] * lados[B];
        return area;
    }

    public double calculaPerimetro() {
        perimetro = (
            (lados[A] * 2) +
            (lados{B} * 2)
        );
        return perimetro;
    }

    public void mudaCor(String cor) {
        this.cor = cor;
    }

    public String pegaCor() {
        return cor;
    }
}