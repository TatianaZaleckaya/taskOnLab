import java.util.List;

/**
 * перевернуть строку «Никогда не ошибается тот, кто ничего не делает»,
 * изменив расположение символов в строке задом наперёд без использования встроенных в String функций.
 */
public class Task2 {
    public static void main(String[] args) {
        String value = "Никогда не ошибается тот, кто ничего не делает";
        char[] charArray = value.toCharArray();
        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }
    }
}
