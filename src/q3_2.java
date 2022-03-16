import java.util.Scanner;
    public class q3_2 extends q3{

        public static void main(String[] args) {

            q3_2 i = new q3_2();
            q3_2 k = new q3_2();
            q3_2 l = new q3_2();

            int n1,n2;
            System.out.println("enter n1");
            Scanner num1 = new Scanner(System.in);
            int a = num1.nextInt();
            System.out.println("enter n2");
            Scanner num2 = new Scanner(System.in);
            int b = num2.nextInt();
            System.out.println("enter number to check divisibility by 8: ");
            Scanner num3 = new Scanner(System.in);
            int j = num3.nextInt();



            int res1 = i.adder(a,b);
            int res3 = k.multi(a,b);
            String res4 = l.div(j);

            System.out.println(res1);
            System.out.println(res3);

        }
    }




