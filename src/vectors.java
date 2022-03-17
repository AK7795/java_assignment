import java.util.Vector;

public class vectors {
    public static void main(String[] args) {

        Vector<String> a = new Vector<>();

        a.add("hi");
        a.add("hey");
        a.add("hello");
        System.out.println(a);

        Vector<String> b = new Vector<>();

        b.add("Hola");
        b.add("namaste");
        System.out.println(b);

        a.addAll(b);
        System.out.println(a);
        System.out.println(b);

    }
}