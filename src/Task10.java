import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * вычислить число Фибоначчи
 */
public class Task10 {

    public static void main(String[] args) {
        try (Scanner cs = new Scanner(System.in)) {
            System.out.println("Введите целое число, для которого необходимо посчитать факториал");
            int n = cs.nextInt();
            int[] f = new int[n];
            f[0] = 0;
            f[1] = 1;
            for (int i = 2; i < n; i++) {
                f[i] = f[i - 1] + f[i - 2];
            }
            for (int i = 0; i <= n; i++) {
                System.out.print(f[i] + " ");
            }

        } catch (NoSuchElementException e) {
            System.out.println("Введенные данные не являются целым числом");
        }
    }
}


