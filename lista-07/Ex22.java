class Ex22 {

    static final byte A = 0;
    static final byte E = 1;
    static final byte I = 2;
    static final byte O = 3;
    static final byte U = 4;     

    static byte[] vowelsFrequency(String phrase) {
        byte[] freqs = {0, 0, 0, 0, 0};
        byte code;

        for (byte i = 0; i < phrase.length(); i++) {
            code = (byte) phrase.charAt(i);

            if (code == 65 || code == 97) {
                freqs[A] += 1;
                continue;
            } else if (code == 69 || code == 101) {
                freqs[E] += 1;
                continue;
            } else if (code == 73 || code == 105) {
                freqs[I] += 1;
                continue;
            } else if (code == 79 || code == 111) {
                freqs[O] += 1;
                continue;
            } else if (code == 85 || code == 117) {
                freqs[U] += 1;
            }
        }

        return freqs;
    }

    static void distribution(String phrase) {
        byte[] freqs = vowelsFrequency(phrase);

        System.out.println("Phrase:\n\"" + phrase + "\"\n\n");
        System.out.println("Vowel\tFrequency\n");
        System.out.format(
            "A\t%d\nE\t%d\nI\t%d\nO\t%d\nU\t%d\n",
            freqs[A], freqs[E], freqs[I], freqs[O], freqs[U]
        );
    }

    public static void main(String[] args) {
        String phrase = "the quick brown fox jumps over the lazy dog";

        distribution(phrase);
    }  
}