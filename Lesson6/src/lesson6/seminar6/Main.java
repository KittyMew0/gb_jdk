package lesson6.seminar6;

import java.util.Random;
import java.util.HashMap;

public class Main{
    public static void main(String[] args){
        int switchWins = 0;
        int stayWins = 0;
        Random gen = new Random();
        
        HashMap<String, Integer> statistic = new HashMap<String, Integer>();
        
        for(int plays = 0; plays < 10; plays++ ){
            int[] doors = {0, 0, 0}; //where 0 becomes a goat, 1 becomes a car
            doors[gen.nextInt(3)] = 1;
            int choice = gen.nextInt(3);
            int shown;
            
            do {
                shown = gen.nextInt(3);
            } while(doors[shown] == 1 || shown == choice);

            stayWins += doors[choice];
            statistic.put("stayWins", stayWins);

            switchWins += doors[3 - choice - shown];
            statistic.put("switchWins", switchWins);
            
            System.out.println("We're on " + plays + ", stay and win = " + statistic.get("stayWins") 
            					+ ", switch and win = " + statistic.get("switchWins"));
        }
        
        System.out.println("Switching wins " + statistic.get("switchWins") + " times.");
        System.out.println("Staying wins " + statistic.get("stayWins") + " times.");
    }
}