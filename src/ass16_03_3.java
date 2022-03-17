import java.util.random.RandomGenerator;

public class ass16_03_3 {
    public static void main(String[] args) {
        ass16_03_3 random = new ass16_03_3();

        int x = RandomGenerator.getDefault().nextInt(10000, 20000);
        int y = RandomGenerator.getDefault().nextInt(11000, 25000);

        System.out.println("random numbers created are : ");
        System.out.println(x);
        System.out.println(y);

        System.out.println("the sum of 2 random no is :");
        System.out.println(x+y);
        System.out.println("the difference of 2 random no is :");
        System.out.println(Math.abs(x-y));
        System.out.println("the product of 2 random no is :");
        System.out.println(x*y);
        System.out.println("the average of 2 random no is :");
        System.out.println((x+y)/2);


    }
}