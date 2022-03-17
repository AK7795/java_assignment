import java.util.Scanner;

public class ass16_03_5 {
    public static void main(String[] args) {

        System.out.println("enter birth year : ");
        Scanner n = new Scanner(System.in);
        int x = n.nextInt();

        String y = (x%4==0) ? "its a leap year !":"its not a leap year";
        System.out.println(y);

    }
}
