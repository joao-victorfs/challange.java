import java.util.Random;

public class desafio {
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
        }

        for (int c = 0; c < 1000000; c++) {
            for (int d = 0; d < 24; d++) {
                if (r.nextInt(6) + 1 == 6 && r.nextInt(6) + 1 == 0) {
                    wins2++;
                    break;
                }
            }
        }

        double mean, sd, var = 0;

        mean = (wins + wins2) / 2;

        var = Math.pow(mean - wins, 2) + Math.pow(mean - wins2, 2) / 2;

        sd = Math.sqrt(var);

        System.out.println("Wins in game 1: " + wins);
        System.out.println("Wins in game 2: " + wins2);
        System.out.println("The Mean is: " + mean);
        System.out.println("The Variance is: " + var);
        System.out.println("The Standart Deviation is: " + sd);
    }

}
