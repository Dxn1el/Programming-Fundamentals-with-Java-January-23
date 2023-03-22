package TextProcessing.Lab;
import java.util.*;
public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String remove= scanner.nextLine();
        String text=scanner.nextLine();
        while(text.contains(remove)){
            text=text.replace(remove,"");
            char H='H';

            int h = H;
            System.out.println(h);
        }


        System.out.println(text);
    }
}
