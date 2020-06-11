package ex04;

class Insercao {
    public static Pessoa[] ordenador(Pessoa[] vpVelho) {
        Pessoa[] vp = new Pessoa[vpVelho.length];

        for (int i = 0; i < vp.length; i++) {
            vp[i] = vpVelho[i];
        }

        Pessoa tmp;

        for (int i = 1, j = 1; i < vp.length; i++, j = i) {
            tmp = vp[i];

            while (j > 0 && vp[j-1].RG() > tmp.RG()) {
                vp[j] = vp[--j];
            }

            vp[j] = tmp;
        }

        return vp;
    }  
}