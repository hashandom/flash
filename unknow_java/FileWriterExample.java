import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        String fiel = "file3.txt";
        try{
                FileWriter fw = new FileWriter(fiel);
                fw.write("i am the hero");
                System.out.println("created file and write" + fiel);
                fw.close();
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
