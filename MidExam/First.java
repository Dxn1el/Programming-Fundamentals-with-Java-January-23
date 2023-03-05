package MidExam;

import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double neededExperience=Double.parseDouble(scanner.nextLine());
        int countOfBattles=Integer.parseInt(scanner.nextLine());
        double experienceGained=0;
        int battleCount=0;
        for (int i = 0; i <countOfBattles ; i++) {
            double XP=Double.parseDouble(scanner.nextLine());
            battleCount++;
            if(battleCount%3==0){
               XP=XP+XP*15.0/100.0;

            }else if(battleCount%5==0){
                XP=XP-XP*10.0/100;
            }
            if(battleCount%15==0){
                XP=XP+XP*5.0/100.0;
            }
            experienceGained+=XP;
            if(experienceGained>=neededExperience){
                System.out.printf("Player successfully collected his needed experience for %d battles.",battleCount);
                return;
            }
        }
        System.out.printf("Player was not able to collect the needed experience, %.2f more needed.",neededExperience-experienceGained);
    }
}
