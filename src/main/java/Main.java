import com.google.gson.Gson;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        System.out.println(PhoneNumberSearcher.searchNumber(new File("C:\\Users\\agrte\\Documents\\GitHub\\TenthModule\\src\\main\\java\\\\file.txt")));
        System.out.println(WordsFreqCounter.count(new File("C:\\Users\\agrte\\Documents\\GitHub\\TenthModule\\src\\main\\java\\words.txt")));
       UsersAdder.put(new File("C:\\Users\\agrte\\Documents\\GitHub\\TenthModule\\src\\main\\java\\file1.txt"));
    }
}
