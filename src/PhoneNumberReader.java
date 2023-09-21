import java.io.File;
import java.io.FileReader;
import java.util.Arrays;

public class PhoneNumberReader {

    public static String searchNumber(File file){
        try(FileReader reader= new FileReader(file)){
            StringBuilder sb =new StringBuilder();
            char[] chars = new char[256];
            int c;
            while ((c=reader.read(chars))>0){
    if (c<256)chars= Arrays.copyOf(chars,c);
    sb.append(chars);
            }
            return search(sb.toString());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    public static String search(String st) {
        String number = "(\\d{3})-(\\d{3})-(\\d{4})";
        StringBuilder sb = new StringBuilder();
        char[] chars = st.toCharArray();
        if (chars.length > 13) {
            for(int i=0;i< chars.length-13;i++){
                if((Character.isDigit(chars[i])&&Character.isDigit(chars[i+1])&&Character.isDigit(chars[i+2])&&chars[i+3]=='-'
                        &&Character.isDigit(chars[i+4])&&Character.isDigit(chars[i+5])&&Character.isDigit(chars[i+6])&&chars[i+7]=='-'
                        &&Character.isDigit(chars[i+8])&&Character.isDigit(chars[i+9])&&Character.isDigit(chars[i+10])&&Character.isDigit(chars[i+11])) )
                {
                    char[] c;
                    System.arraycopy(chars,i, c= new char[12],0,12);
                    sb.append(c);
                    sb.append("\n");
                }else if((chars[i]=='('&&Character.isDigit(chars[i+1])&&Character.isDigit(chars[i+2])&&Character.isDigit(chars[i+3])&&chars[i+4]==')'&& chars[i+5]==' '
                        &&Character.isDigit(chars[i+6])&&Character.isDigit(chars[i+7])&&Character.isDigit(chars[i+8])&&chars[i+9]==' '
                        &&Character.isDigit(chars[i+10])&&Character.isDigit(chars[i+11])&&Character.isDigit(chars[i+12])&&Character.isDigit(chars[i+13])))
                {
                    char[] c;
                    System.arraycopy(chars,i, c= new char[14],0,14);
                    sb.append(c);
                    sb.append("\n");
                }
            }
            return sb.toString();
        }
        return null;
    }
}

