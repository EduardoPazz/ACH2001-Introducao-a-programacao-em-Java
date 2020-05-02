package ex13;

class IntervaloDeTempo {
    long horas;
    long minutos;
    byte segundos;

    String representacao;
    
    IntervaloDeTempo(long segundos) {
        this.minutos = segundos / 60;
        this.horas = this.minutos / 60;

        this.segundos = (byte) (segundos - (60 * this.minutos));
        this.minutos -= 60 * this.horas;

        representacao = (
            Long.toString(this.horas) + ":" +
            Long.toString(this.minutos) + ":" +
            Byte.toString(this.segundos)
        );
    }
}