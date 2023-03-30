import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * "Нужно написать метод, на вход которого подается число, нужно:
 * <p>
 * // # если число четное, вывести на экран сообщение, что это четное число
 * // # если число делится на 10, вывести одну десятую числа
 * // # если число делится на 3, вывести факториал этого числа
 * // # если выполняется несколько условий, выводим все соответствующие варианты"
 */
public class Task12 {
    public static void main(String[] args) {
        try (Scanner cs = new Scanner(System.in)) {
            System.out.println("Введите число");
            checkNumber(cs.nextInt());
        } catch (NoSuchElementException e) {
            System.out.println("Введенные данные не являются целым числом");
        }
    }

    static void checkNumber(int number) {
        checkEvenNumber(number);
        oneOfTenNumber(number);
        factorialForNumber(number);
    }

    static void checkEvenNumber(int number) {
        if (number % 2 == 0) {
            System.out.println("Число четное");
        }
    }

    static void oneOfTenNumber(int number) {
        double s = number/10;
        System.out.println(s);

    }

    static void factorialForNumber(int number) {
        if (number % 3 == 0) {
            int result = 1;
            for (int i = 1; i <= number; i++) {
                result *= i;
            }
            System.out.println(result);
        }
    }
}
