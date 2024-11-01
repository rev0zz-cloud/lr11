/*Напишите функцию, которая принимает на вход список строк и
возвращает новый список, содержащий только те строки, которые
имеют длину больше заданного значения.*/
package lr11.example7;

import java.util.List;
import java.util.stream.Collectors;

public class Example7 {
    public static void main(String[] args) {

        String string = "Строка100, строка2000 \n" +
                "Строка30000, строка400000 \n" +
                "строка50.";

        List<String> strings = List.of(string.split(" "));
        System.out.println("\n Строка до преобразования: " + "\n" );
        for (String e : strings){
            System.out.println(e);
        }

        List<String> stringAfter = filterStringsLength(strings);

        System.out.println("\n Строка после преобразования: " + "\n" );
        for (String e : stringAfter){
            System.out.println(e);
        }
    }
    public static List<String> filterStringsLength (List<String> list){
        return  list.stream()
                .filter(s -> s.length()>10)
                .collect(Collectors.toList());
    }
}
