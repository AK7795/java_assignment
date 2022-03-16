import java.util.Scanner;

public class Error {
    public static void main(String[] args) {
        System.out.println("enter number of whose root u desire");
        Scanner n = new Scanner(System.in);
        double x = n.nextDouble();
        System.out.println(Math.sqrt(x));
    }
}