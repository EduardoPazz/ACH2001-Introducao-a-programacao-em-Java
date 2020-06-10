package ex02;

class Ferrari extends Veiculo implements VeiculoDeCorrida {
    Ferrari(String modelo, String cor, int potencia) {
        marca = "Ferrari";

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