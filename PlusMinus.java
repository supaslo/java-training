import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PlusMinus {

    public static void plusMinus(List<Integer> arr) {
        List<Integer> positiveArray = new ArrayList<>();
        List<Integer> negativeArray = new ArrayList<>();
        List<Integer> zeroArray = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                positiveArray.add(arr.get(i));
            } else if (arr.get(i) < 0) {
                negativeArray.add(arr.get(i));
            } else {
                zeroArray.add(arr.get(i));
            }
        }

        double positveRatio = positiveArray.size() / (double) arr.size();
        double negativeRatio = negativeArray.size() / (double) arr.size();
        double zeroRatio = zeroArray.size() / (double) arr.size();

        System.out.println(String.format("%.6f", positveRatio));
        System.out.println(String.format("%.6f", negativeRatio));
        System.out.println(String.format("%.6f", zeroRatio));
    
    }

    public static void main(String[] args) throws IOException {
        List<Integer> testArray = new ArrayList<>();
        testArray.add(-4);
        testArray.add(3);
        testArray.add(-9);
        testArray.add(0);
        testArray.add(4);
        testArray.add(1);

        plusMinus(testArray);
    }
    
}
