import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class assess2_1 {
    public static void main(String[] args) {
                String s = "HAPPY NEW YEAR";

                try {
                    FileOutputStream f = new FileOutputStream("data.txt");

                    byte b[] = s.getBytes();
                    f.write(b);
                    f.close();
                    System.out.println("file created !");
                }
                catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                catch (IOException e){
                    System.out.println(e);
                }
     }
}

