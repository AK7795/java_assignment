import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class assess2 {
    public static void main(String[] args) {

                try {
                    FileInputStream f = new FileInputStream("data.txt");
                    int i =0,k=0,l=0,m=0,n=0,o=0;
                    while ((i = f.read())!=-1){
                        if((char)i == 'A' ) {k++;}
                        if((char)i == 'E' ) {l++;}
                        if((char)i == 'I' ) {m++;}
                        if((char)i == 'O' ) {n++; }
                        if((char)i == 'U' ) {o++; }
                    }
                    System.out.println("The number of  A's are :");
                    System.out.println(k);
                    System.out.println("The number of E's are :");
                    System.out.println(l);
                    System.out.println("The number of I's are :");
                    System.out.println(m);
                    System.out.println("The number of O's are :");
                    System.out.println(n);
                    System.out.println("The number of U's are :");
                    System.out.println(o);
                     }
                catch (FileNotFoundException e) {
                    e.printStackTrace();}
                catch (IOException e){
                    System.out.println(e);}
    }
}
