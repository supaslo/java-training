import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MinMaxSum {

    public static void miniMaxSum(List<Integer> arr) {
        Collections.sort(arr);
        List<Long> sumsList = getArrayOfSums(arr);
        Collections.sort(sumsList);
        System.out.println(sumsList.get(0) + " " + sumsList.get(sumsList.size()));
    }

    public static List<Long> getArrayOfSums(List<Integer> arr) {
        List<Long> sumsList = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            List<Integer> modifiedArray = new ArrayList<>();
            modifiedArray = getModifiedArray(arr, i);
            System.out.println("Sum of modified array=" + getSumOfFour(modifiedArray));
            sumsList.add(getSumOfFour(modifiedArray));
        }
        return sumsList;
    }

    public static List<Integer> getModifiedArray(List<Integer> arr,Integer index) {
        /*List<Integer> modifiedArray = new ArrayList<>();
        Integer numberToRemove = arr.get(index);
        System.out.println("Number to remove=" + numberToRemove);
        if (arr.remove(numberToRemove)) {
            System.out.println("Inside remove statement, array size =" + arr.size());
            modifiedArray = arr;
        }
        return modifiedArray;*/
        if (arr == null || index < 0 || index >= arr.size()) {
            return arr;
        }

        // return the resultant array
        return Stream<Integer>.range(0, arr.size())
            .filter(i -> i != index)
            .map(i -> arr[i])
            .toArrayList();
    }

    public static Long getSumOfFour(List<Integer> arr) {
        Long sum = 0L;
        for (int i = 0; i < arr.size(); i++) {
            System.out.println("getSumOfFour sum=" + arr.get(i));
            sum = sum + arr.get(i);
        }
        return sum;
    }

    public static void main(String[] args) throws IOException {
        List<Integer> testArray = new ArrayList<>();
        testArray.add(1);
        testArray.add(3);
        testArray.add(5);
        testArray.add(7);
        testArray.add(9);

        miniMaxSum(testArray);
    }
}