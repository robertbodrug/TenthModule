import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListFileReader {

    public static ArrayList<String> giveStrings(File file){
        try(Scanner sc= new Scanner(new FileInputStream(file))){
            ArrayList<String> ar =new ArrayList<>();
            while (sc.hasNextLine()){
    ar.add(sc.nextLine());
            }
            return ar;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }


}


