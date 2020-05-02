package ex11;

class TabelaDeAliquotasEDeducao {
    byte linhaTabela(float totalRendimentos) {
        if (totalRendimentos <= 22847.76) {
            return 1;
        } else if (totalRendimentos <= 33919.80) {
            return 2;
        } else if (totalRendimentos <= 45012.60) {
            return 3;
        } else if (totalRendimentos <= 55976.16f) {
            return 4;
        } else {
            return 5;
        }
    }

    float aliquota(float totalRendimentos) {
        float aliquota = 0;

        switch (linhaTabela(totalRendimentos)) {
            case 1: break;
            case 2: aliquota = .075f;
                break;
            case 3: aliquota = .15f;
                break;
            case 4: aliquota = .225f;
                break;
            case 5: aliquota = .275f;
                break;
        } 

        return aliquota;
    }

    float valorADeduzir(float totalRendimentos) {
        float deducao = 0;

        switch (linhaTabela(totalRendimentos)) {
            case 1: break;
            case 2: deducao = 1713.58f;
                break;
            case 3: deducao = 4257.57f;
                break;
            case 4: deducao = 7633.51f;
                break;
            case 5: deducao = 10432.32f;
                break;
        } 

        return deducao;
    }
}