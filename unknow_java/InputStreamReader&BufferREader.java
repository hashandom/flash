import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

class file1{
    public static void main(String[] args) {
        try {
            FileInputStream fs = new FileInputStream("file.txt");
            BufferedInputStream bs = new BufferedInputStream(fs);
            InputStreamReader ir = new InputStreamReader(bs);
            BufferedReader br = new BufferedReader(ir);

            String line;
            while((line = br.readLine()) != null){
                    System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
   
    }
}