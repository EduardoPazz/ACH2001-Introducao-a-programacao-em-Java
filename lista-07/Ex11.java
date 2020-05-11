import java.util.Scanner;

class Ex11 {
    static Scanner input = new Scanner(System.in);

    static Result aAndSpaceScanner(String phrase) {
        char[] charArray = phrase.toCharArray();

        byte aQuant = 0, spaceQuant = 0;

        for (char character : charArray) {
            if (character == ' ') spaceQuant++;
            if (character == 'a') aQuant++;
        }

        return new Result(aQuant, spaceQuant);
    }

    public static void main(String[] args) {
        System.out.print("Provide a phrase: ");
        String phrase = input.nextLine();

        Result result = aAndSpaceScanner(phrase);

        System.out.println(
            "\nThe phrase:\n\n" +
            "\"" + phrase + "\"\n\n" +
            "has " + result.aQuant + " a" + 
            " and " + result.spaceQuant + " spaces."
        );
    }
}

class Result {
    byte aQuant;
    byte spaceQuant;

    Result(byte aQuant, byte spaceQuant) {
        this.aQuant = aQuant;
        this.spaceQuant = spaceQuant;
    }
}