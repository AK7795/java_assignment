import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class j17_3_3 {
    public static void main(String[] args) {

        ArrayList<String> a = new ArrayList<>();

        a.add("a");
        a.add("b");
        a.add("c");

        System.out.println(a);

        a.add(3,"d");

        a.set(2,"C");
        System.out.println(a);

    }
}
