import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JavaTutorial {

    public static void main(String[] args) throws IOException {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

        /*Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });*/

        /*Collections.sort(names, (String a, String b) -> {
            return b.compareTo(a);
        });*/

        //Collections.sort(names, (String a, String b) -> b.compareTo(a));

        Collections.sort(names, (a, b) -> b.compareTo(a));

        for (String name : names) {
            System.out.println(name);
        }
    }
}
