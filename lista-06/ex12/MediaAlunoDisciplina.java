package ex12;

class MediaAlunoDisciplina {
    String nomeAluno;
    String nomeDisciplina;
    
    int numAluno;

    byte pesoTrabalho;
    byte pesoProva;
    
    float mediaTrabalhos;
    float mediaProvas;
    float mediaPonderada;

    MediaAlunoDisciplina(
        String nomeAluno,
        int numAluno,
        String nomeDisciplina,
        byte pesoTrabalho,
        byte pesoProva,
        float mediaTrabalhos,
        float mediaProvas
    ) {
        if (
            (pesoTrabalho + pesoTrabalho > 10) ||
            (mediaProvas > 10) ||
            (mediaTrabalhos > 10)
        ) {
            errorHandling();
            return;
        }

        this.nomeAluno = nomeAluno;
        this.numAluno = numAluno;
        this.nomeDisciplina = nomeDisciplina;
        this.pesoTrabalho = pesoTrabalho;
        this.pesoProva = pesoProva;
        this.mediaTrabalhos = mediaTrabalhos;
        this.mediaProvas = mediaProvas;

        calculaMediaPonderada();
    }

    void calculaMediaPonderada() {
        mediaPonderada = (
            (mediaTrabalhos * pesoTrabalho) +
            (mediaProvas * pesoProva)
        ) / (pesoProva + pesoTrabalho);
    }

    void imprimeDados() {
        System.out.format(
            "Nome Aluno:\t%s\nNúmero Aluno:\t%d\n\nNome Disciplina:\t%s\n\nPeso Trabalhos:\t%d\nPeso Provas:\t%d\n\nMédia Trabalhos:\t%.2f\nMédia Provas:\t%.2f\nMédia Final:\t%.2f\n",
            nomeAluno,
            numAluno,
    
            nomeDisciplina,
            
            pesoTrabalho,
            pesoProva,
            
            mediaTrabalhos,
            mediaProvas,
            mediaPonderada
        );
    }

    void errorHandling() {
        System.out.println(
            "Alguma das notas excede a soma de 10. Reinicie o programa"
        );
    }
}