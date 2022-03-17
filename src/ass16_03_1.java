import java.util.Scanner;

public class ass16_03_1 {
    public static void main(String[] args) {

        System.out.println("enter temp in Fahrenheit : ");
        Scanner s = new Scanner(System.in);
        double x = s.nextDouble();

        double y = (x-32)*5/9;
        System.out.println("Temp in celsius : ");
        System.out.println(y);

    }
}

