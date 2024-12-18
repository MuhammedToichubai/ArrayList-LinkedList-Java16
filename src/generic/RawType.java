package generic;

import java.util.Arrays;
import java.util.List;

public class RawType {
    public static void main(String[] args) {
        showList(Arrays.asList(1, 7,2 ,4 ,5));
        showList(Arrays.asList("Kanchoro", "Ernis","Ainura" ,"Guljamal eje" ,"Nurbol"));


    }


    public static List<?> returnList(List<? extends CharSequence> stringList, List<Integer> integerList, boolean isTrue){
        if (isTrue){
            return stringList;
        }
        else {
            return integerList;
        }
    }

    public static void showList(List<?> list){
        for (Object o : list) {
            System.out.println(o);
        }
    }
}
