package streamApi;

import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 2.2. Который четные числа умножает на 100, а от нечетных отнимает 100 и возвращает коллекцию.
 * Количество принимаемых и возвращаемых элементов коллекций должно совпадать
 */
public class Task14 {
    public static void main(String[] args) {
        List<Integer> list = new Random().ints(30,1,100)
                .boxed()
                .collect(Collectors.toList());

        List<Integer>first = list.stream().filter(n->n%2==0).map(n->n*100).collect(Collectors.toList());
        List<Integer>second = list.stream().filter(n->n%2!=0).map(n->n-100).collect(Collectors.toList());
        List<Integer> result = Stream.of(first,second).flatMap(Collection::stream).collect(Collectors.toList());
         }
}
