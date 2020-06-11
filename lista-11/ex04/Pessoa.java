package ex04;

class Pessoa {
    private String nome;
    private int RG;
    private int CPF;

    Pessoa(String nome, int RG, int CPF) {
        this.nome = nome;
        this.RG = RG;
        this.CPF = CPF;
    }

    public String nome() {return nome;}
    public int RG() {return RG;}
    public int CPF() {return CPF;}
}