/*Напишите функцию, которая принимает на вход список строк
и возвращает новый список, содержащий только те строки,
которые содержат заданную подстроку.*/
package lr11.example5;

import java.util.List;
import java.util.stream.Collectors;

public class Example5 {
    public static void main(String[] args) {

        String string = "Строка1, строка2 \n" +
                "Строка 3, строка4, \n" +
                "строка5.";

        List<String> strings = List.of(string.split(" "));
        System.out.println("\n Строка до преобразования: " + "\n" );
        for (String e : strings){
            System.out.println(e);
        }

        List<String> stringAfter = filterStrings(strings);

        System.out.println("\n Строка после преобразования: " + "\n" );
        for (String e : stringAfter){
            System.out.println(e);
        }
    }
    public static List<String> filterStrings (List<String> list){
        return  list.stream()
                .filter(s -> s.contains("строка2"))
                .collect(Collectors.toList());
    }
}
