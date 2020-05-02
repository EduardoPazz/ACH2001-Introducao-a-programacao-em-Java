package ex12;

class Ex12 {
    public static void main(String[] args) {
        MediaAlunoDisciplina relatorio = new MediaAlunoDisciplina(
            "Eduardo da Paz" /* nomeAluno */,
            11845114 /* numAluno */,
            "Introdução à Programação" /* nomeDisciplina */,
            (byte) 3 /* pesoTrabalho */,
            (byte) 7 /* pesoProva */,
            7.8f /* mediaTrabalhos */,
            9.1f /* mediaProvas */
        );

        relatorio.imprimeDados();
    }
}