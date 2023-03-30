/**
 * написать метод который определяет является ли строка "Аргентина манит негра" палиндромом
 */
public class Task8 {
    public static void main(String[] args) {
        String value = "Аргентина манит негра";
        checkPolindrom(value);
    }

    static void checkPolindrom(String string) {
        String valueReplace = string.replaceAll(" ", "");
        String reverse = new StringBuilder(valueReplace).reverse().toString();
        System.out.println(valueReplace.equalsIgnoreCase(reverse));
    }
}




