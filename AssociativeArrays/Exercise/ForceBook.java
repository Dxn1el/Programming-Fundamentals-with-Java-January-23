package AssociativeArrays.Exercise;

import java.util.*;

public class ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, ArrayList<String>> teams = new LinkedHashMap<>();

        while (!input.equals("Lumpawaroo")) {

            if (input.contains("|")) {

                String team = input.split(" \\| ")[0];
                String player = input.split(" \\| ")[1];
                if (!teams.containsKey(team)) {
                    teams.put(team, new ArrayList<>());
                }

                boolean exist = false;

                for (List<String> value : teams.values()) {
                    if(value.contains(player)){
                    exist=true;
                }
                }
                if (!exist) {
                    teams.get(team).add(player);
                }

            } else if (input.contains("->")) {
                String player = input.split(" -> ")[0];
                String team = input.split(" -> ")[1];
                //•	If there is such force user already -> change their side. //
                //•	If there is no such force user on any force side -> add the force user to the corresponding force side.
                //•	If there is no such force user and no such force side -> create a new force side and add the force user to the corresponding side.
                if (!teams.containsKey(team)) {
                    teams.put(team, new ArrayList<>());
                }
                boolean exist=false;
                for (ArrayList<String> value : teams.values()) {
                    if(value.contains(player));
                    exist=true;
                    value.remove(player);
                }
                if (exist) {
                    teams.get(team).add(player);
                    System.out.printf("%s joins the %s side!%n",player,team);
                }



            }
            input=scanner.nextLine();
        }
teams.entrySet().stream().filter(entry->entry.getValue().size()>0);
        for (Map.Entry<String, ArrayList<String>> entry : teams.entrySet()) {
            if(entry.getValue().size()<=0){
                continue;
            }
            System.out.printf("Side: %s, Members: %d%n",entry.getKey(),entry.getValue().size());
            for (String value : entry.getValue()) {
                System.out.printf("! %s%n",value);
            }
        }

    }
}
