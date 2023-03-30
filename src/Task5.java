/**
 * удалить символ " ! " в строке "Работать нужно не 12 часов, а головой!"
 */
public class Task5 {
    public static void main(String[] args) {
        String value = "Работать нужно не 12 часов, а головой!";
        int indexSymbol = value.indexOf("!");
        System.out.println(removeSymbol(value, indexSymbol));
    }

    static String removeSymbol(String s, int index) {
        return s.substring(0, index) + s.substring(index + 1);
    }
}
