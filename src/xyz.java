import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class xyz {
    public static void main(String[] args) {
        String s = "hello java !";

        try {
            FileOutputStream f = new FileOutputStream("sam.txt");

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
