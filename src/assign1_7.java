import java.util.Scanner;

public class assign1_7 {
    public static void main(String[] args) {
        // leap year or not
        Scanner s = new Scanner(System.in);
        System.out.println("enter year : ");
        int a = s.nextInt();

        if(a%4 == 0){
            System.out.println("its a leap year!!");

        }
        else {
        System.out.println("not a leap year");
        }
        }

    }

