package streamApi;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 2.3. Есть стринговый лист фамилий, нужно пройтись по списку, вытащить фамилии которые начинаются на А
 * и поместить их в другой список для дальнейшей работы с ними
 */
public class Task15 {
    public static void main(String[] args) {
        List<String> surname = Stream.of("Андреев", "Петров", "Аркашин", "Ломоносов").collect(Collectors.toList());
        List<String> selectSurname = surname.stream().filter(p->p.contains("А")).collect(Collectors.toList());
        System.out.println(selectSurname);
    }
}
