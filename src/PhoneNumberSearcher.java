import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class PhoneNumberSearcher {
    public static String searchNumber(File file) {
        StringBuilder sb = new StringBuilder();
        ArrayList<String> strings = ArrayListFileReader.giveString(file);
        Pattern p1 = Pattern.compile("\\(\\d\\d\\d\\) \\d\\d\\d \\d\\d\\d\\d");
        Pattern p2 = Pattern.compile("\\d\\d\\d-\\d\\d\\d-\\d\\d\\d\\d");
        for(String s :strings){
            if(p1.matcher(s).matches()){
                sb.append(s);
                sb.append("\n");
            }else
            if(p2.matcher(s).matches()){
                sb.append(s);
                sb.append("\n");
            }
        }

            return sb.toString();


    }
}
//        if (chars.length > 13) {
//            for(int i=0;i< chars.length-13;i++){
//                //xxx-xxx-xxxx
//                if((Character.isDigit(chars[i])&&Character.isDigit(chars[i+1])&&Character.isDigit(chars[i+2])&&chars[i+3]=='-'
//                        &&Character.isDigit(chars[i+4])&&Character.isDigit(chars[i+5])&&Character.isDigit(chars[i+6])&&chars[i+7]=='-'
//                        &&Character.isDigit(chars[i+8])&&Character.isDigit(chars[i+9])&&Character.isDigit(chars[i+10])&&Character.isDigit(chars[i+11])) )
//                {
//                    char[] c;
//                    System.arraycopy(chars,i, c= new char[12],0,12);
//                    sb.append(c);
//                    sb.append("\n");
//                }else
//                    //(xxx) xxx xxxx
//                    if((chars[i]=='('&&Character.isDigit(chars[i+1])&&Character.isDigit(chars[i+2])&&Character.isDigit(chars[i+3])&&chars[i+4]==')'&& chars[i+5]==' '
//                        &&Character.isDigit(chars[i+6])&&Character.isDigit(chars[i+7])&&Character.isDigit(chars[i+8])&&chars[i+9]==' '
//                        &&Character.isDigit(chars[i+10])&&Character.isDigit(chars[i+11])&&Character.isDigit(chars[i+12])&&Character.isDigit(chars[i+13])))
//                {
//                    char[] c;
//                    System.arraycopy(chars,i, c= new char[14],0,14);
//                    sb.append(c);
//                    sb.append("\n");
//                }
//            }