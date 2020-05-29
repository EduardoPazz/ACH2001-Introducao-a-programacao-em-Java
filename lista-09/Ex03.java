public class ExecutarPessoas {
    public static void main(String[] args) {
        Pessoa p1;
        Pessoa p2;
        Aluno a1;
        Aluno a2;
        p1 = new Pessoa(); // funciona
        p2 = new Aluno(); // funciona
        a1 = new Aluno(); // funciona
        System.out.println("Contador A1: " + a1.contador); // funciona
        System.out.println("Contador Pessoa: " + Pessoa.contador); // funciona
        a2 = new Pessoa(); // funciona
        p2.estudar(); // funciona
        p2.comer(); // funciona
        p2.caminhar(); // funciona
        p2.correr(); // não funciona

        /*
            3
            3
            Aluno estudando
            Aluno comendo
            Pessoa caminhando
        */
    }
}