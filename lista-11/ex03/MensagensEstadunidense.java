package ex03;

class MensagensEstadunidense implements MensagensSobreNeoNatal {
    String nomeDoBebe(String nome) {
        return "The baby's name is " + nome + ".";
    }

    String dataDeNascimento(Bebe b) {
        return (
            "The baby was born in " +
            b.mesNascimento() + "/" + 
            b.diaNascimento() + "/" + 
            b.anoNascimento() + "."
        );
    }

    String peso(double pesoEmQuilos) {
        double pesoEmLibras = pesoEmQuilos / 0.45359237;
        return "The baby weights " + pesoEmLibras + " pounds.";
    }

    String temperatura(double temperaturaEmCelsius) {
        double temperaturaEmFahrenheit = 1.8 * temperaturaEmCelsius + 32;
        return "The baby is " + temperaturaEmFahrenheit + " F°.";
    }
}