package ex02;

interface VeiculoDeCorrida {
    String marca();
    String modelo();
    String cor();
    int potenciaEmCavalos();

    static void veiculoPreferido(VeiculoDeCorrida[] veiculos) {
        VeiculoDeCorrida preferido = new Lamborghini("", "", 0);

        for (int i = 1; i < veiculos.length; i++)  {
            if (
                veiculos[i].cor() == "Vermelho" && 
                veiculos[i].potenciaEmCavalos() > preferido.potenciaEmCavalos()
            ) {
                preferido = veiculos[i];
            }
        }

        System.out.println(preferido.marca() + "\n" + preferido.modelo());
    }

    public static void main(String[] args) {
        VeiculoDeCorrida[] veiculos = new VeiculoDeCorrida[5];

        veiculos[0] = new Lamborghini("Aventador", "Laranja", 700);
        veiculos[1] = new Lamborghini("Huracán", "Vermelho", 610);
        veiculos[2] = new Lamborghini("Urus", "Amarelo", 650);
        veiculos[3] = new Ferrari("F12 Berlinetta", "Vermelho", 780);
        veiculos[4] = new Ferrari("Mondial", "Rosa", 500);

        veiculoPreferido(veiculos);
    }
}