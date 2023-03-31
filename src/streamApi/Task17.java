package streamApi;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * 2.5 Найти сумму нечетных чисел в коллекции.
 */
public class Task17 {
    public static void main(String[] args) {
        List<Integer> list = new Random().ints(10, 1, 20)
                .boxed()
                .collect(Collectors.toList());

        long count = list.stream().filter(x -> x % 2 != 0).reduce(Integer::sum).orElse(0);

    }
}
