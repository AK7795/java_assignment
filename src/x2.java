import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class x2 {
    public static void main(String[] args) {

        try {
            FileInputStream f = new FileInputStream("sam.txt");
            int i =0;
            while ((i = f.read())!=-1){
                System.out.println((char)i);
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e){
            System.out.println(e);
        }
    }
}
