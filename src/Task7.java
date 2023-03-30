/**
 * вывести строку "Работать нужно не 12 часов, а головой!" 3 раза с разделителем
 */
public class Task7 {
    public static void main(String[] args) {
        String value = "Работать нужно не 12 часов, а головой!".concat("\n");

        System.out.print(value.repeat(3));
    }
}
