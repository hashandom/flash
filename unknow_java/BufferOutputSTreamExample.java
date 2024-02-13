import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferOutputSTreamExample {
    public static void main(String[] args) {
        String file = "file2.txt";
        String data = "thsi is my mother";

        try{
FileOutputStream fs = new FileOutputStream(file);
BufferedOutputStream bs = new BufferedOutputStream(fs);
byte [] data1 = data.getBytes();
bs.write(data1);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
