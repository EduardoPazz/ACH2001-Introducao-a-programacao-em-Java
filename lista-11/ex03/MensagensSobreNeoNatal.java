package ex03;

interface MensagensSobreNeoNatal {
    String nomeDoBebe(String nome);
    String dataDeNascimento(Bebe b);
    String peso(double pesoEmQuilos);
    String temperatura(double temperaturaEmCelsius);
}