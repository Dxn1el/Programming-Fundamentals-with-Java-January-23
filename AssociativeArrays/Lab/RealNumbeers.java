package AssociativeArrays.Lab;

import com.sun.source.tree.Tree;

import java.text.DecimalFormat;
import java.util.*;

public class RealNumbeers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        TreeMap<Double, Integer> numbersMap = new TreeMap<>();

        for (double number : numbersArr) {
            numbersMap.putIfAbsent(number,0);
            numbersMap.put(number,numbersMap.get(number)+1);
        }

        for (Map.Entry<Double, Integer> entry : numbersMap.entrySet()) {
            DecimalFormat df = new DecimalFormat("#.######");

            System.out.printf("%s -> %d%n",df.format(entry.getKey()), entry.getValue());
        }

    }

}
