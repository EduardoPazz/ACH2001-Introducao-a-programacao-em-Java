package ex01;

class Quadrado extends Poligono implements Figura2D {
    double lado;

    Quadrado(double lado) {
        this.lado = lado;
        calculaArea();
        calculaPerimetro();
    }

    public double calculaArea() {
        area = lado * lado;
        return area;
    }

    public double calculaPerimetro() {
        perimetro = lado * 4;
        return perimetro;
    }

    public void mudaCor(String cor) {
        this.cor = cor;
    }

    public String pegaCor() {
        return cor;
    }
}