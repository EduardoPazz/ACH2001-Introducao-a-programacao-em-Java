package ex01;

class Circulo extends Poligono /* circulos não são poligonos, mas beleza */ implements Figura2D {
    double raio;

    Circulo(double raio) {
        this.radio = raio;
        calculaArea();
        calculaPerimetro();
    }

    public double calculaArea() {
        area = Math.PI * raio * raio;
        return area;
    }

    public double calculaPerimetro() {
        perimetro = 2 * Math.PI * raio;
        return perimetro;
    }

    public void mudaCor(String cor) {
        this.cor = cor;
    }

    public String pegaCor() {
        return cor;
    }
}