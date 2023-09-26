import java.io.File;
import java.util.*;

public class WordsFreqCounter {
    public static String count(File file){
        StringBuilder stringBuilder = new StringBuilder();
        ArrayList<String> arrayList = ArrayListFileReader.giveStrings(file);
        HashMap<String,Integer> map = new LinkedHashMap<>();
        Integer in;
        for (String si:arrayList){
            String[] strings = si.split(" ");
            for(String s :strings) {
                map.put(s,(in=map.get(s))!=null?in+1:1);
            }

        }
        ArrayList<Map.Entry<String,Integer>> list = new ArrayList<>(map.entrySet());

        int i, j;
        boolean swapped;
        Map.Entry<String,Integer> temp;
        for (i = 0; i < list.size(); i++) {
            swapped = false;
            for (j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j).getValue() < list.get(j + 1).getValue()) {

                    // Swap arr[j] and arr[j+1]
                    temp = list.get(j);
                    list.set(j,list.get(j+1));
                    list.set(j+1,temp);
                    swapped = true;
                }
            }

            // If no two elements were
            // swapped by inner loop, then break
            if (!swapped)
                break;

        }
        return list.toString();
    }
}
