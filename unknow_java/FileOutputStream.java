import java.io.IOException;
import java.io.FileOutputStream;

class FileOutputStream123{
    public static void main(String[] args){
        String file = "file1.txt";
        String data = "hello father";
        try{
                FileOutputStream fs = new FileOutputStream(file);
                byte[] data1 = data.getBytes();
                fs.write(data1);
                System.out.println("file created and input data" + file);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}