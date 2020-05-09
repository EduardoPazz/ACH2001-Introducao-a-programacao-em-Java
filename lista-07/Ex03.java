class Ex03 {
    static void firstLetterAfterSpace(String string) {
        char[] charArray = string.toCharArray();
        boolean test; 

        for (
            byte i = 0;
            i < charArray.length;
            i++
        ) {
            test = charArray[i] == ' ';

            if (test) {
                do {
                    test = charArray[++i] == ' ';
                } while (test);

                System.out.print(charArray[i]);
            } 
        }
    }

    public static void main(String[] args) {
        String string = "This is a example";
        
        firstLetterAfterSpace(string); // "Tiae"
    }
}