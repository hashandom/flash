import java.io.BufferedInputStream;
import java.io.FileInputStream;

class file{
    public static void main(String[] args) {
        try {
            FileInputStream fs = new FileInputStream("file.txt");
            BufferedInputStream bs = new BufferedInputStream(fs);
            int data;
            while ((data = bs.read())!=-1) {
                System.out.print((char)data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}