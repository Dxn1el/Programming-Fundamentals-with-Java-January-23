package AssociativeArrays.Exercise;

import java.util.*;
import java.util.Scanner;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input= scanner.nextLine();
Map<String, ArrayList<String>> coursesInfoMap=new LinkedHashMap<>();
        while(!input.equals("end")){

            String courseName= input.split(" : ")[0];
            String studentName= input.split(" : ")[1];
            if(!coursesInfoMap.containsKey(courseName)){
                coursesInfoMap.put(courseName, new ArrayList<>());
            }

            coursesInfoMap.get(courseName).add(studentName);
            input=scanner.nextLine();
        }
        for (Map.Entry<String, ArrayList<String>> entry : coursesInfoMap.entrySet()) {
            System.out.printf("%s: %d%n",entry.getKey(),entry.getValue().size());
            for (String s : entry.getValue()) {
                System.out.printf("-- %s%n",s);
            }
        }


    }
}
