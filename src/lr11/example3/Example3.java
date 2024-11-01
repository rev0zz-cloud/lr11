/*Напишите функцию, которая принимает на вход
список строк и возвращает новый список,
содержащий только те строки, которые начинаются с большой буквы.*/
package lr11.example3;

import java.util.List;
import java.util.stream.Collectors;

public class Example3 {
    public static void main(String[] args) {

        String string = "Строка1, Строка2 и \n" +
                "строка3, Строка4, \n" +
                "строка5.";

        List<String> strings = List.of(string.split(" "));
        System.out.println("\n Строка после сплитования: " + "\n" );
        for (String e : strings){
            System.out.println(e);
        }

        List<String> stringAfter = filterCapitalizedStrings(strings);

        System.out.println("\n Строка после преобразования: " + "\n" );
        for (String e : stringAfter){
            System.out.println(e);
        }
    }
    public static List<String> filterCapitalizedStrings (List<String> list){
        return  list.stream()
                .filter(s -> Character.isUpperCase(s.charAt(0)))
                .collect(Collectors.toList());
    }
}
