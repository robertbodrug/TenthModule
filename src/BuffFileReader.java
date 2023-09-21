import java.io.File;
import java.io.FileReader;
import java.util.Arrays;

public class BuffFileReader {

    public static String giveString(File file){
        try(FileReader reader= new FileReader(file)){
            StringBuilder sb =new StringBuilder();
            char[] chars = new char[256];
            int c;
            while ((c=reader.read(chars))>0){
    if (c<256)chars= Arrays.copyOf(chars,c);
    sb.append(chars);
            }
            return sb.toString();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }


}


