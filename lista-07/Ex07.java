class Ex07 {
    static String[] spaceSeparator(String string) {
        char[] charArray = string.toCharArray();

        // tmp == temporary
        String[] tmpStringArray = new String[charArray.length];
        byte tmpsAI = 0; // tmpsAI == tmpStringArrayIndex
        String tmpString = ""; 
        
        boolean test; 
        
        for (
            byte i = 0, j = i;
            i < charArray.length;
            i++
        ) {
            test = charArray[i] == ' ';

            if (test) {
                do {
                    test = charArray[++j] == ' ';
                } while (test);

                tmpStringArray[tmpsAI++] = tmpString;
                tmpString = "";

                j = i;
            } else {
                tmpString += charArray[i];
            }
        }

        tmpStringArray[tmpsAI++] = tmpString;

        // Now, creating a correct-size stringArray

        String[] stringArray = new String[tmpsAI];

        for (byte i = 0; i < tmpsAI; i++) {
            stringArray[i] = tmpStringArray[i];
        }

        return stringArray;
    }

    public static void main(String[] args) {
        String string = "This is a example";
        
        String[] stringArray = spaceSeparator(string);

        for (String word : stringArray) {
            System.out.println(word);
        }
    }
}