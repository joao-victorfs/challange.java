import java.util.Random;

public class challenge {
    public static void main(String[] args) {
        int wins = 0;
        int wins2 = 0;
        Random r = new Random();

        for (int a = 0; a < 1000000; a++) {
            for (int b = 0; b < 4; b++) {
                if (r.nextInt(6) + 1 == 6) {
                    wins++;
                    break;
                }
            }
            for (int c = 0; c < 24; c++) {
                if (r.nextInt(6) + 1 == 6 && r.nextInt(6) + 1 == 6) {
                    wins2++;
                    break;
                }
            }
        }

        double mean1, mean2, sd1, sd2, var1, var2 = 0;

        mean1 = (double) wins / (double) 1000000;
        mean2 = (double) wins2 / (double) 1000000;

        var1 = Math.pow(wins - mean1, 2) / 1000000 - 1;
        var2 = Math.pow(wins2 - mean2, 2) / 1000000 - 1;

        sd1 = Math.sqrt(var1);
        sd2 = Math.sqrt(var2);

        System.out.println("Wins in game 1: " + wins);
        System.out.println("Wins in game 2: " + wins2);
        System.out.println("The Mean for the game 1 is: " + mean1);
        System.out.println("The Mean for the game 2 is: " + mean2);
        System.out.println("The Variance for the game 1 is: " + var1);
        System.out.println("The Variance for the game 2 is: " + var2);
        System.out.println("The Standart Deviation for the game 1 is: " + sd1);
        System.out.println("The Standart Deviation for the game 2 is: " + sd2);
    }

}
