/*Create an abstract class 'Parent' with a method 'message'.
 It has two subclasses each having a method with the same name 'message' that prints
 "This is first subclass" and "This is second subclass" respectively.
Call the methods 'message' by creating an object for each subclass.*/
abstract class parent{
    abstract void message();
}

class sub1 extends parent{

    void message(){
        System.out.println("This is first subclass");

    }
}

class sub2 extends parent{

    void message(){
        System.out.println("This is second subclass");


    }
}
class x1{
    public static void main(String[] args) {
        parent o1 = new sub1();
        parent o2 = new sub2();
        o1.message();
        o2.message();
    }
}