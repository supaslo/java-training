import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> pointsForEachPlayer = new ArrayList<Integer>();
        Integer playerOneScore = 0;
        Integer playerTwoScore = 0;
        Integer noWin = 0;

        for (int i = 0; i < a.size(); i++) {
            System.out.println("Alice's " + i + " rating: " + a.get(i));
            System.out.println("Bob's " + i + " rating: " + b.get(i));
            if (a.get(i) > b.get(i)) {
                playerOneScore++;
            }else if(a.get(i) < b.get(i)) {
                playerTwoScore++;
            }else {
                noWin++;
            }
        }
        
        pointsForEachPlayer.add(playerOneScore);
        pointsForEachPlayer.add(playerTwoScore);

        return pointsForEachPlayer;

    }

}

public class CompareTriplets {
    public static void main(String[] args) throws IOException {

        List<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);

        List<Integer> b = new ArrayList<Integer>();
        b.add(3);
        b.add(2);
        b.add(1);
        List<Integer> result = Result.compareTriplets(a, b);
        System.out.println("Alice's Score is: " + result.get(0));
        System.out.println("Bob's Score is: " + result.get(1));
    }
}