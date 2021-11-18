import java.io.IOException;

public class StairCase {
    public static void stairCase(int n) {
        String output = createStairText(n,"X");

        for (int i = 0; i < n; i++) {
            if (!(i == 0)) {
                String newText = createStairText(n - i," ");
                String oldText = createStairText(i,"X");
                System.out.println(newText + oldText);
            }
        }
        System.out.println(output);
    }

    private static String createStairText(int n, String x) {
        String base = "";
        for (int i = 0; i < n; i++) {
            base = base + x;
        }
        return base;
    }

    public static void main(String[] args) throws IOException {
        stairCase(6);
    }
}
