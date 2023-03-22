package TextProcessing.Exercise;
import java.util.*;
public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input=scanner.nextLine();
        String[] path= input.split("\\\\");


        String [] result=path[path.length-1].split("\\.");
        System.out.printf("File name: %s%nFile extension: %s",result[0],result[1]);


    }
}
