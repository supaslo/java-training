import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DiagonalDifference {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> matrixArray, int dimension) {
        List<Integer> diagonalOrder = new ArrayList<>();

        for (int i = 0; i < dimension; i++) {
            diagonalOrder.add(i);
        }

        List<Integer> firstDiagonal = findDiagonalByOrder(matrixArray, diagonalOrder);
        Collections.sort(diagonalOrder, Collections.reverseOrder());
        List<Integer> secondDiagonal = findDiagonalByOrder(matrixArray, diagonalOrder);

        int sumFirstDiagonal = sumArray(firstDiagonal);
        int sumSecondDiagonal = sumArray(secondDiagonal);

        return findPositiveDifference(sumFirstDiagonal,sumSecondDiagonal);
    }

    static List<Integer> findDiagonalByOrder(List<List<Integer>> matrixArray, List<Integer> order) {
        List<Integer> diagonal = new ArrayList<>();
        for(int i = 0; i < matrixArray.size(); i++) {
            List<Integer> array = matrixArray.get(i);
            diagonal.add(array.get(order.get(i)));
        }
        return diagonal;
    }

    static int findPositiveDifference(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber - secondNumber;
        } else {
            return secondNumber - firstNumber;
        }
    }

    static int sumArray(List<Integer> ar) {
        int sum = 0;

        for(int i: ar) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) throws IOException {
        List<List<Integer>> matrixArray = new ArrayList<>();
        int n = 4;

        List<Integer> arrayOne = new ArrayList<>();
        arrayOne.add(-1);
        arrayOne.add(1);
        arrayOne.add(-7);
        arrayOne.add(-8);

        List<Integer> arrayTwo = new ArrayList<>();
        arrayTwo.add(-10);
        arrayTwo.add(-8);
        arrayTwo.add(-5);
        arrayTwo.add(2);

        List<Integer> arrayThree = new ArrayList<>();
        arrayThree.add(0);
        arrayThree.add(9);
        arrayThree.add(7);
        arrayThree.add(-1);

        List<Integer> arrayFour = new ArrayList<>();
        arrayFour.add(4);
        arrayFour.add(4);
        arrayFour.add(-2);
        arrayFour.add(1);

        matrixArray.add(arrayOne);
        matrixArray.add(arrayTwo);
        matrixArray.add(arrayThree);
        matrixArray.add(arrayFour);

        System.out.println("the difference of the diagonals are: " + diagonalDifference(matrixArray, n));
    }
}
