import java.util.Random;

public class Main {
	public static void main(String[] args) {
		int wins = 0;
		int losses = 0;
		Random r = new Random();
		
		for(int a = 0; a < 1000000; a++) {
		    if(r.nextInt(6) + 1 == 6) 
		       wins++; 
		    else 
		       losses++;}
		    
		int wins2 = 0;
        int losses2 = 0;
        
        for(int b = 0; b < 1000000; b++) {
            int numOfSix = 0;
        for(int c = 0; c < 2; c++)
            if(r.nextInt(6) + 1 == 6)
            numOfSix++;
            if (numOfSix > 1)
               wins2++;
            else
               losses2++;}
 
      double mean,var,sd;
      mean = (wins + wins2)/2;
      
      var = (mean - wins)*(mean - wins)+(mean - wins2)*(mean - wins2)/2;
      
      sd = Math.sqrt(var);
      
    System.out.println("Wins in game 1: "+ wins+", Losses in game 1: "+ losses);
    System.out.println("Wins in game 2: "+ wins2+", Losses in game 2: "+ losses2);
    System.out.println("The Mean is: "+ mean);
    System.out.println("The Variance is: "+ var);
    System.out.println("The Standart Deviation is: "+ sd);
    }  
}
