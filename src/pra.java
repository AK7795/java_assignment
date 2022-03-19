import java.util.ArrayList;
import java.util.Scanner;

public class pra {
    public static void main(String[] args) {

        ArrayList<String> a = new ArrayList<>();
        System.out.println("enter name of 3 st :");
        int i = 3;
        while (i>0){
            Scanner s = new Scanner(System.in);
            a.add(s.nextLine());

            i--;
        }
        System.out.println(a);
    }

}
