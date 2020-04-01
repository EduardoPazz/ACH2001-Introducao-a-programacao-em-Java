import java.util.Scanner;

class Ex09 {
    static Scanner input = new Scanner(System.in);

    static int teamID = 0;
    static boolean newTeam;

    static int playerID;
    static boolean newPlayer;

    static int yellowCount;
    static int redCount;

    static boolean inputWrong;

    static double yellowFee(int cards) {
        return cards * 1000.2;
    }

    static double redFee(int cards) {
        return cards * 4523.75;
    }

    public static void main(String[] args) {
        do { /* iterate multiples teams */
            teamID++;

            playerID = 0;
            yellowCount = 0;
            redCount = 0;

            System.out.printf("This is the team number %d.\n", teamID);

            do { /* Calculate the number of cards per player, itering them */
                playerID++;
                System.out.printf("This is the player number %d from team number %d. How many yellow cards he/she received (type 0 for none)? ", playerID, teamID);
                yellowCount += input.nextInt();

                System.out.print("And how many red cards he/she received (type 0 for none)? ");
                redCount += input.nextInt();

                System.out.printf("Wanna register one more player from team %d? (S/N) ", teamID);
                switch (input.next()) {
                    case "S":
                    newPlayer = true;    
                        break;
                    case "N":
                    newPlayer = false;
                        break;
                }

            } while (newPlayer);
            
            System.out.printf("The team %d received a total of %d yellow cards and %d red cards, totalizing the fee of R$%.02f.\n", teamID, yellowCount, redCount, yellowFee(yellowCount) + redFee(redCount));

            System.out.print("Wanna register one more team? ");
                switch (input.next()) {
                    case "S":
                    newTeam = true;    
                        break;
                    case "N":
                    newTeam = false;
                        break;
                }

        } while (newTeam);
    }
}