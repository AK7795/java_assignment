
/*2. Create an interface 'Bank' with a method 'getBalance'.
$100, $150 and $200 are deposited in banks A, B and C respectively.
'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each having a method named 'getBalance'.
 Call this method by creating an object of each of the three classes.
*/
public interface banks  {
    void getbalance();

}

class BankA implements banks {
    public void getbalance(){
        System.out.println("Bank A : $100");
    }

}

class BankB implements banks {
    public void getbalance(){
        System.out.println("Bank B : $150");
    }

}

class BankC implements banks {
    public void getbalance(){
        System.out.println("Bank C : $200");

    }
}

class bb {
    public static void main(String[] args) {


        banks b1 = new BankA();
        banks b2 = new BankB();
        banks b3 = new BankC();

        b1.getbalance();
        b2.getbalance();
        b3.getbalance();
    }
}