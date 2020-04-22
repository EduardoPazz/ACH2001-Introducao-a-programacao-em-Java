class Ex11 {
    static byte[] numOcorrencia(byte[] lancamentos) {
        byte[] ocorrencias = new byte[6];

        for (byte numero : lancamentos) switch (numero) {
            case 1: ocorrencias[numero - 1]++;
                break;
            case 2: ocorrencias[numero - 1]++;
                break;
            case 3: ocorrencias[numero - 1]++;
                break;
            case 4: ocorrencias[numero - 1]++;
                break;
            case 5: ocorrencias[numero - 1]++;
                break;
            case 6: ocorrencias[numero - 1]++;
                break;
        }

        return ocorrencias;
    }

    public static void main(String[] args) {
        byte[] lancamentos = {3, 4, 6, 4};

        byte[] numOcorrencia = numOcorrencia(lancamentos);

        for (byte i = 0; i < numOcorrencia.length; i++) {
            System.out.format("Ocorrência com o número %d:\t%d\n", i + 1, numOcorrencia[i]);
        }

        
    }
}