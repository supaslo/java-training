import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParseCSV {
    public static void main(String[] args) {
        String csv1 = new String("id,name,age,act,room,dep.\n1,Jack,68,T,13,8\n17,Betty,28,F,15,7");
        String column1 = new String("age");
        //int[] intArray2 = new int[]{1,2,3}; 
        //int[] intArray3 = new int[]{-1,-3};
        System.out.println("Highest age is:  " + findHighestValueInColumn(csv1, column1));
        //System.out.println("Missing Number for Test 2 is:  " + findSmallestNumberNotIncluded(intArray2));
        //System.out.println("Missing Number for Test 3 is:  " + findSmallestNumberNotIncluded(intArray3));
    }

    public static String findHighestValueInColumn(String S, String C) {
        String[] rows = S.split("\n");
        String headerRow = fetchHeaderRow(rows);
        String[] headerCells = headerRow.split(",");
        int columnIndex = findDesiredColumn(headerCells, C);
        return highestValueInDesiredColumn(rows, columnIndex);

        /*for (String row : rows) {
            String[] 
        }
        String headerRow = lines[0];
    
        List<String> linesList = Arrays.asList(lines);
        ArrayList<String> linesArrayList = new ArrayList<String>(linesList);
        String headerRow = linesArrayList[0];
        
        for (String line : linesArrayList) {
            System.out.println(line);
            //int columnIndex = linesArrayList.indexOf(C); 
        }
        return "68";*/
    }

    private static String fetchHeaderRow(String[] rows) {
        return rows[0];
    }

    private static int findDesiredColumn(String[] headerCells, String desiredColumn) {
        List<String> headerCellsList = Arrays.asList(headerCells);
        ArrayList<String> headerCellArrayList = new ArrayList<String>(headerCellsList);
        return headerCellArrayList.indexOf(desiredColumn);
    }

    private static String highestValueInDesiredColumn(String[] rows, int columnIndex) {
        ArrayList<String> listOfValueFromDesiredColumn = new ArrayList();
        for (int i = 0; i > rows.length; i++) {
            if (!(i == 0)) {
                listOfValueFromDesiredColumn.add(i);
            }
        }
    }
}
