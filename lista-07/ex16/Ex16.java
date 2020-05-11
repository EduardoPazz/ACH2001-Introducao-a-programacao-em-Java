package ex16;

import java.util.Scanner;

class Ex16 {
    static Scanner input = new Scanner(System.in);

    static String order(byte order) {
        if (order < 21) {
            switch (order) {
                case 1: return "1st";
                case 2: return "2nd";
                case 3: return "3rd";
                default: return order + "th";
            }
        } else {
            switch (order % 10) {
                case 1: return order + "st";
                case 2: return order + "nd";
                case 3: return order + "rd";
                default: return order + "th";
            }            
        }
    }    

    static float getFinalScore(
        float[] scoresEP,
        float scoreTest
    ) {
        float totalScoreEP = 0;

        for (byte i = 0; i < 3; i++) {
            totalScoreEP += .1f * scoresEP[i];
        }

        totalScoreEP += .15f * scoresEP[3];

        return totalScoreEP + ( .55f * scoreTest );
    }

    public static void main(String[] args) {
        float[] scoresEP = new float[4];

        for (byte i = 0; i < 4; i++) {
            System.out.format(
                "Provide the score of the %s EP: ",
                order(i + (byte) 1)
            );
            scoresEP[i] = input.nextFloat();
        }

        System.out.print(
            "Great! Now, provide the score of the single test: "
        );
        float scoreTest = input.nextFloat();

        System.out.format(
            "Your final score is:\t%f",
            getFinalScore(scoresEP, scoreTest)
        );
    }
}