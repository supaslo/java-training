// you can also use imports, for example:
// import java.util.*;
import java.util.Arrays;
import java.util.HashSet;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class MissingInteger {
    public static void main(String[] args) {
        int[] intArray1 = new int[]{1, 3, 6, 4, 1, 2}; 
        int[] intArray2 = new int[]{1,2,3}; 
        int[] intArray3 = new int[]{-1,-3};
        System.out.println("Missing Number for Test 1 is:  " + findSmallestNumberNotIncluded(intArray1));
        System.out.println("Missing Number for Test 2 is:  " + findSmallestNumberNotIncluded(intArray2));
        System.out.println("Missing Number for Test 3 is:  " + findSmallestNumberNotIncluded(intArray3));
    }
    public static int findLowestNumberNotFound(int[] intArray) {
        Arrays.sort(intArray);
        int previousNumber = intArray[0] - 1;
        int nextNumber = intArray[0] + 1;
        for(int i = 0; i < intArray.length; i++) {
            int currentNumber = intArray[i];
            if (currentNumber > nextNumber) {
                System.out.println("Missing Number, Current Number = " + currentNumber + ", previous number = " + previousNumber + ", next number = " + nextNumber);
                if (nextNumber < 1) {
                    return 1;
                } else {
                    return nextNumber;
                }
            } else if (currentNumber == previousNumber) {
                System.out.println("Matching Number, Current Number = " + currentNumber + ", previous number = " + previousNumber + ", next number = " + nextNumber);
            } else if (currentNumber > previousNumber) {
                System.out.println("Next Number, Current Number = " + currentNumber + ", previous number = " + previousNumber + ", next number = " + nextNumber);
            } else {
                System.out.println("First Number, Current Number = " + currentNumber + ", previous number = " + previousNumber + ", next number = " + nextNumber);
            }
            previousNumber = intArray[i];
            nextNumber = intArray[i] + 1;
        }
        System.out.println("Final Number = " + nextNumber);
        if (nextNumber < 1) {
            return 1;
        } else {
            return nextNumber;
        }
    }
    public static int findSmallestNumberNotIncluded(int[] intArray) {
        int length = intArray.length;
        int lowestNumber = 1;
        HashSet<Integer> set = new HashSet<>();
        for (int a : intArray) {
            if (a > 0) {
                set.add(a);
            }
        }
        for (int i = 1; i <= length; i++) {
            if (!set.contains(i)) {
                return i;
            } else {
                lowestNumber++;
            }
        }
        return lowestNumber;
    }    
}
