import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Подсчитать количество конкретных слов в строке "Упади семь раз и восемь раз поднимись", используя HashMap.
 */
public class Task3 {
    public static void main(String[] args) {
        String value = "Упади семь раз и восемь раз поднимись";
        Map<String,Integer> wordCounts = new HashMap<>();
        Arrays.stream(value.split(" ")).filter(w->w.length()>0).forEach(w->wordCounts.put(w,wordCounts.getOrDefault(w,0)+1));
        System.out.println();


    }
}
