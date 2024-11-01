/*Напишите функцию, которая принимает на вход список строк и
возвращает новый список, содержащий только те строки,
которые содержат только буквы (без цифр и символов).*/
package lr11.example9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example9 {
    public static void main(String[] args) {

        String string = "Строкабезцифр и строка1000\n" +
                "Строка???.\n";

        List<String> strings = List.of(string.split(" "));
        System.out.println("\n Строка после сплитования: " + "\n" );
        for (String e : strings){
            System.out.println(e);
        }

        List<String> stringAfter = filterStringsOnlyLetters(strings);

        System.out.println("\n Строка после преобразования: " + "\n" );
        for (String e : stringAfter){
            System.out.println(e);
        }
    }
    public static List<String> filterStringsOnlyLetters(List<String> strings) {
        List<String> filteredStrings = new ArrayList<>();

        for (String str : strings) {
            if (containsOnlyLetters(str)) {
                filteredStrings.add(str);
            }
        }

        return filteredStrings;
    }
    private static boolean containsOnlyLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }
}
