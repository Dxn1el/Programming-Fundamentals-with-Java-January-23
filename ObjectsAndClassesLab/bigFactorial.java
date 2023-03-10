package ObjectsAndClassesLab;

import java.math.BigInteger;
import java.util.Scanner;

public class bigFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numberToFindFac=scanner.nextLine();

        BigInteger result= new BigInteger("1");
        for (int i = 1; i <=Integer.parseInt(numberToFindFac) ; i++) {
           result=result.multiply(BigInteger.valueOf(i));
        }
        System.out.println(result);
    }
}
