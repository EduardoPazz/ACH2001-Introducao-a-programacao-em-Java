package ex14;

class Ex14 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(
            "Eduardo da Paz",
            "Masculino",
            386379804,
            new short[] {14, 07, 2017}
        );
        
        System.out.println(
            pessoa.idade(new short[] {02, 05, 2020}) + 
            " anos."
        );
    }   
}