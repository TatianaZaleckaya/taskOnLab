package streamApi;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 2.1. Который отрицательные числа делает положительными и возвращает коллекцию ([1, 5, -3, 7] -> [1, 5, 3, 7])
 */
public class Task13 {
    public static void main(String[] args) {
        List<Integer> collect = Stream.of(1, 5, -3, 7).map(Math::abs).collect(Collectors.toList());
        System.out.println(collect);
    }
}
