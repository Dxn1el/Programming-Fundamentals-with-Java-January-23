package ObjectsAndClassesLab;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n1=scanner.nextLine();
        String n2=scanner.nextLine();
        BigInteger bigInt1= new BigInteger(n1);
        BigInteger bigInt2= new BigInteger(n2);
        System.out.println(bigInt1.add(bigInt2));

    }
}
