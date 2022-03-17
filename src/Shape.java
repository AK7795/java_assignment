/* We have to calculate the area of a rectangle, a square and a circle. Create an abstract class 'Shape'
with three abstract methods namely
'RectangleArea' taking two parameters, 'SquareArea' and 'CircleArea' taking one parameter each.
The parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea'
is its side and that of 'CircleArea' is its radius.
Now create another class 'Area' containing all the three methods 'RectangleArea',
 'SquareArea' and 'CircleArea' for printing the area of rectangle, square and circle respectively.
Create an object of class 'Area' and call all the three methods.*/

abstract class Shape{
abstract double Rectanglearea(double x,double y);
abstract double SquareArea(double z);
abstract double CircleArea(double r);
}

class Area extends Shape {

    double Rectanglearea(double x, double y) {
        double a = x * y;
        System.out.println("Area of rectangle is :");
        System.out.println(a);
        return a;
    }

    double SquareArea(double z) {
        double j = z * z;
        System.out.println("Area of rectangle is :");
        System.out.println(j);
        return j;
    }

    double CircleArea(double r) {
        System.out.println("The area of circle is : ");
        double k = 3.14 * r * r;
        System.out.println(k);
        return k;


    }
}

class x{
    public static void main(String[] args) {
        Shape o1 = new Area();
        Shape o2 = new Area();
        Shape o3 = new Area();
        o1.Rectanglearea(5,10);
        o2.SquareArea(5);
        o3.CircleArea(2);
    }
}
