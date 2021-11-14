public class BinaryGapComparison {
    public static void main(String[] args) {
        System.out.println(compareBinaryGap(34));
    }

    private static int compareBinaryGap(int N) {
        String binaryRepresentation = Integer.toBinaryString(N);
        char[] charArray = binaryRepresentation.toCharArray();
        System.out.println(binaryRepresentation);
        return findBinaryGaps(charArray);
    }

    private static int findBinaryGaps(char[] charArray) {
        boolean startGap = false;
        int gapLength = 0;
        for(int i = 0; i < charArray.length; i++) {
            if(charArray[i] == '1') {
                startGap = true;
            } else if(startGap && charArray[i] == '0') {
                gapLength++;
            } else if(charArray[i] == '1') {
                startGap = false;
            }
        }
        return gapLength;
    }
}