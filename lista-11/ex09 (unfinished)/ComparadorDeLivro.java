package ex09;

interface ComparadorDeLivro {
    /*
     * retorna:
       * 1 se atributo específico de livro1 e maior que livro2
       * -1 se atributo específico de livro1 ́e menor que livro2
       * 0 se atributo específico de livro1 e igual a livro2
    */
    int livroMenor(Livro livro1, Livro livro2);
}