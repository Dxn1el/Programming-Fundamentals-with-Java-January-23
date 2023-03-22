package RegEx.Exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StarEnigma {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int loop = Integer.parseInt(scanner.nextLine());
        int attackedPlanetsCount=0;
        int destroyedPlanetsCount=0;
        List<String> destroyedPlanetsList=new ArrayList<>();
        List<String> attackedPlanetsList=new ArrayList<>();
        Pattern pattern = Pattern.compile("@(?<planetName>[A-Za-z]+)[^@\\-!:>]*?:(?<planetPopulation>[0-9]+)[^@\\-!:>]*?!(?<attackType>[A,D])![^@\\-!:>]*?->(?<soldierCount>[0-9]+)");

        for (int i = 0; i < loop; i++) {

            String input = scanner.nextLine();
            StringBuilder sb = new StringBuilder();
            int count= 0;
            for (char c : input.toLowerCase().toCharArray()) {
                if(c=='a'||c=='t'||c=='s'||c=='r'){
                    count++;
                }
            }
            for (char c : input.toCharArray()) {
                int decryptedCharacterAscii=c-count;
                char decryptedChar=(char) decryptedCharacterAscii;
                sb.append(decryptedChar);
            }

            String decryptedText = String.valueOf(sb);
            Matcher matcher= pattern.matcher(decryptedText);
            while(matcher.find()){
                String planetName=matcher.group("planetName");
                int planetPopulation= Integer.parseInt(matcher.group("planetPopulation"));
                String attackType=matcher.group("attackType");
                if(attackType.equals("A")){
                    attackedPlanetsCount+=1;
                    attackedPlanetsList.add(planetName);

                }else{
                    destroyedPlanetsCount+=1;
                    destroyedPlanetsList.add(planetName);
                }
            }

        }
        Collections.sort(destroyedPlanetsList);
        Collections.sort(attackedPlanetsList);
        System.out.printf("Attacked planets: %d%n",attackedPlanetsCount);
        for (String s : attackedPlanetsList) {
            System.out.println("-> "+s);
        }
        System.out.printf("Destroyed planets: %d%n",destroyedPlanetsCount);
        for (String s : destroyedPlanetsList) {
            System.out.println("-> "+s);
        }
    }
}
