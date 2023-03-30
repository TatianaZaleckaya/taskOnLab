/**
 * перевернуть строку
 * «Никогда не ошибается тот, кто ничего не делает», изменив расположение символов в строке задом наперёд без использования встроенной в String функции reverse().
 */
public class Task1 {
    public static void main(String[] args) {

        String value = "Никогда не ошибается тот, кто ничего не делает";
        char[] strToArray = value.toCharArray();

        StringBuilder builder = new StringBuilder();
        for (int i = strToArray.length - 1; i >= 0; i--) {
            builder.append(strToArray[i]);
        }
        System.out.println(builder);

    }
}
