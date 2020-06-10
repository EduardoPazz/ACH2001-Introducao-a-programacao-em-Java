package ex02;

class Lamborghini extends Veiculo implements VeiculoDeCorrida {
    Lamborghini(String modelo, String cor, int potencia) {
        marca = "Lamborghini";

        this.modelo = modelo;
        this.cor = cor;
        this.potencia = potencia;
    }

    public String marca() {
        return marca;
    }

    public String modelo() {
        return modelo;
    }

    public String cor() {
        return cor;
    }

    public int potenciaEmCavalos() {
        return potencia;
    }    
}