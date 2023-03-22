package TextProcessing.Exercise;

import java.math.BigInteger;
import java.util.*;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger firstBigInt = new BigInteger(scanner.nextLine());
        BigInteger secondBigInt = new BigInteger(scanner.nextLine());

        System.out.println(firstBigInt.multiply(secondBigInt));


    }
}
