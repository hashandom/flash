import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;

/**
 * TokonizerExample
 */
public class TokonizerExample {

    public static void main(String[] args) {
        String word ="my age is 24";

        try{
FileReader fr = new FileReader(word);
StreamTokenizer st = new StreamTokenizer(fr);
while(st.nextToken() != StreamTokenizer.TT_EOF){
    switch (st.ttype) {
        case st.TT_WORD:
        System.out.println("word" + st.sval);
        break;
        case st.TT_NUMBER:
        System.out.println("number"+st.nval);
            break;

        default:
System.out.println("the punctation" );
        }
        case value:
            
            break;
    
        default:
            break;
    }
}
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
     
}