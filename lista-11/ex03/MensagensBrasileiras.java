package ex03;

class MensagensBrasileiras implements MensagensSobreNeoNatal {
    String nomeDoBebe(String nome) {
        return "O nome do bebê é " + nome + ".";
    }

    String dataDeNascimento(Bebe b) {
        return (
            "O bebê nasceu em " +
            b.diaNascimento() + "/" + 
            b.mesNascimento() + "/" + 
            b.anoNascimento() + "."
        );
    }

    String peso(double pesoEmQuilos) {
        return "O bebê possui " + pesoEmQuilos + " quilogramas.";
    }

    String temperatura(double temperaturaEmCelsius) {
        return "O bebê está com " + temperaturaEmCelsius + " C°.";
    }
}