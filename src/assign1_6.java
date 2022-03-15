import java.util.Scanner;

public class assign1_6 {
    public static void main(String[] args) {

        int  rev = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number- ");
        int a = sc.nextInt();

        while(a != 0)
        {
            int rem = a % 10;
            rev = rev * 10 + rem;
            a = a/10;
        }
        System.out.println("The reverse of the given number is: " + rev);
    }
}
