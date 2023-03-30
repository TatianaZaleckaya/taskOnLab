/**
 * заменить символ " * " в строке "Неуд*ч* – это просто возможность н*ч*ть снов*, но уже более мудро." на символ "а"
 */
public class Task4 {
    public static void main(String[] args) {
        String value = "Неуд*ч* – это просто возможность н*ч*ть снов*, но уже более мудро.";
        String result = replace(value);
        System.out.println(result);
    }
    static String replace(String value){return value.replace("*", "a");}
}
