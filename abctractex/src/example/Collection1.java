package example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection1 {
    public static void main(String[] args) {
        List<String> words=List.of("APPLE","ORANGE","GRAPE","LEMON");
        List<String> wordsArrayLIst=new ArrayList<>(words);
        wordsArrayLIst.add(2,"WATERMELON");
        System.out.println(wordsArrayLIst);
        Iterator <String> Iterator=wordsArrayLIst.iterator();
        while (Iterator.hasNext()){
            if(Iterator.next().endsWith("N")){
                Iterator.remove();
            }


        }System.out.println(wordsArrayLIst);

    }
}
