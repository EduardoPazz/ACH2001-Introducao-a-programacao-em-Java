class Ex02 {
    static void bubble(String[] words) {
        boolean cont = true;
        byte max = (byte) (words.length - 1);
        String stage;

        while (cont) {
            cont = false;
            for (byte i = 0; i < max; i++) {
                if ((byte) words[i].charAt(0) > (byte) words[i+1].charAt(0)) {
                    stage = new String(words[i]);
                    words[i] = new String(words[i+1]);
                    words[i+1] = new String(stage);
                    
                    System.gc();
                    cont = true;
                }
            }
            max--;           
        }
    }

    public static void main(String[] args) {
        String[] words = {
            "Anestesia", "Amor"
        };

        System.out.println("Unsorted:");
        for (String word : words) {
            System.out.println(word);
        }

        bubble(words);

        System.out.println("Sorted:");
        for (String word : words) {
            System.out.println(word);
        }        
    }
}