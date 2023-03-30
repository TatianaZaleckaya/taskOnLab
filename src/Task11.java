import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * вычислить факториал
 */
public class Task11 {
    public static void main(String[] args) {
        try (Scanner cs = new Scanner(System.in)) {
            System.out.println("Введите целое число, для которого необходимо посчитать факториал");
            System.out.println(factorial(cs.nextInt()));
        } catch (NoSuchElementException e) {
            System.out.println("Введенные данные не являются целым числом");
        }
    }

    static int factorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}

