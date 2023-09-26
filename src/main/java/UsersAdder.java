import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.print.attribute.standard.MediaSize;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

public class UsersAdder {

    public static void put(File file) {
        ArrayList<String> strings = ArrayListFileReader.giveStrings(file);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        ArrayList<User> users = new ArrayList<>();
        try(Writer writer = new FileWriter("C:\\Users\\agrte\\Documents\\GitHub\\TenthModule\\src\\main\\java\\users.json")){
            boolean first=true;
            boolean NA=true;
              for (String s:strings) {
                  String[] objects = s.split(" ");
                  if(first){
                      NA= objects[0].equalsIgnoreCase("name") && objects[1].equalsIgnoreCase("age");
                  }
                  else {
                  if(NA) users.add(new User(objects[0],Integer.parseInt(objects[1])));
                  if(!NA) users.add(new User(objects[1],Integer.parseInt(objects[0])));
                  }
                  first=false;
              }
              writer.write(gson.toJson(users));
              writer.flush();
          } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
