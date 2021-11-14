import java.io.*;
import java.util.*;

public class SumArray {

    public static long aVeryBigSum(List<Long> ar) {
        long sum = 0;

        for(long i: ar) {
            sum += i;
        }

        return sum;
    }
    public static void main(String[] args) throws IOException {

        List<Long> ar = new ArrayList<Long>();
        ar.add(0,Long.valueOf(1000000001));
        ar.add(1,Long.valueOf(1000000002));
        ar.add(2,Long.valueOf(1000000003));
        ar.add(3,Long.valueOf(1000000004));
        ar.add(4,Long.valueOf(1000000005));

        long result = aVeryBigSum(ar);
        System.out.println("Sum of the Array= " + result);
    }
}