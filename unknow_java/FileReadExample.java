import java.io.FileReader;
import java.io.IOException;

public class FileReadExample {
    public static void main(String[] args) {
        String fiel3 = "fil.txt";
        try{
                FileReader fr = new FileReader(fiel3);
                int data;
                while((data = fr.read())!= -1){
                    char character = (char)data;
                    System.out.println();
                }
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
