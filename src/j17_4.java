import java.util.ArrayList;

public class j17_4 {
    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();

        a.add(10);
        a.add(20);
        a.add(30);

        System.out.println(a);

        a.add(3,40);

        a.set(2,20);
        a.size();
        System.out.println(a);
        System.out.println(a.size());

    }
}
