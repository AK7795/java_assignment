import java.util.Scanner;

public class methodoverloading extends overload{


        public static void main(String[] args){

            System.out.println("enter int 1 : ");
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            System.out.println("enter int 2 : ");
            Scanner sc1 = new Scanner(System.in);
            int y = sc1.nextInt();

            System.out.println("enter decimal 1 : ");
            Scanner s1 = new Scanner(System.in);
            double j = s1.nextDouble();
            System.out.println("enter decimal 2 : ");
            Scanner s2 = new Scanner(System.in);
            double k = s2.nextDouble();
            System.out.println(overload.add(x,y));
            System.out.println(overload.add(j,k));

        }

    }