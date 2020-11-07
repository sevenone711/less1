package moth2.lesson3;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
//           Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
//           Посчитать сколько раз встречается каждое слово.
        String[] arr = {"Зима","Весна","Зима","Зима","Ноябрь","Декабрь","Ноябрь","Здрасте","Часы","Мышка","Привет","Пока","Привет",};
        dublicate(arr);


//        2. Написать простой класс ТелефонныйСправочник,
//        который хранит в себе список фамилий и телефонных номеров.
//        В этот телефонный справочник с помощью метода add() можно добавлять записи.
//        С помощью метода get() искать номер телефона по фамилии.
//        Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
//        тогда при запросе такой фамилии должны выводиться все телефоны.

    Phonebook phonebook = new Phonebook();
        phonebook.addcontact("Viktor","+797888123");
        phonebook.addcontact("Vova","+797888122");
        phonebook.addcontact("Viktor","+797888111");
        phonebook.addcontact("Vova","+797888444");
        phonebook.addcontact("Kolya","+797888555");
        phonebook.addcontact("Mama","+797888666");
        phonebook.addcontact("Papa","+797888777");

      phonebook.getcontact("Vova");
    }



    private static void dublicate(String[] ars){
        Set<String> set = new LinkedHashSet<>();
        List<String> list = new ArrayList<String>();
        for (String val : ars) {
            set.add(val);
        }
        System.out.println("Оригинальный массив");
        System.out.println(Arrays.toString(ars));
        System.out.println("Без дублей");
        System.out.println(set);
        for (String val : ars) {
            list.add(val);
        }
        Map<String, Long> result = list.stream().collect(
                Collectors.groupingBy(
                        Function.identity(),Collectors.counting()
                )
        );
        System.out.println(result);




    }
}
