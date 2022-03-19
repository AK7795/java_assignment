import java.util.Stack;
import java.util.Vector;

public class vectors {
    public static void main(String[] args) {



        Stack<String> b = new Stack<>();

        b.push("Hola");
        b.push("namaste");
        b.push("hello");

        if(b.empty()){
            System.out.println(" stack is empty ");
        }
        else {
            System.out.println(b);
        }



    }
}