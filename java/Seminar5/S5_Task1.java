package Seminar5;

import java.util.*;

public class S5_Task1 {

    public static void main(String[] args) {

                  /*В map сложный перебор элементов, а сложен из-за того, что нет индексов. Вместо индексов -> ключи.
          А ключи бывают какими угодно. Строки самый адекватный пример */
        HashMap<String, String> map = new HashMap<>();
        map.put("Пять", "Five");
        map.put("Два", "Two");
        map.put("Один", "One");

        String str = map.get("Пять");
//        System.out.println(str);

        map.remove("Пять");
        map.remove("Пять", "Five");

        map.put("Пять", "Five");


//        for (String key: map.keySet()) {
//            System.out.println(map.get(key));
//                map.remove(key);    // <- данная функция не возможна в foreach
//        }

//        Iterator<String> iterator = map.keySet().iterator();
//        while (iterator.hasNext()){         // <- тоже самое что и foreach
//            String key = iterator.next();   // также в данном цикле, нельзя изменить значение, но удалить можем
//            System.out.println(map.get(key));
//        }


//        Set keys = map.keySet();
//        for (int i = 0; i < keys.size(); i++) {         // <- в данном цикле, мы можем и удалить и изменить значение
//            System.out.println(map.get(keys.toArray()[i]));
//        }


        /* если ключ "Пять" существовал, то значение будет заменено на "5"
         * Если ключ "5" не существовал, то он вернет "move"*/
        map.replace("Пять", "5");

        /* Если он не нашел, то он вернет "Ложь", если нашел, то вернет "Истину" и поменяет*/
        map.replace("Пять", "Five", "5");

        /* Он пытается взять в паре ключ-значение, который ключ -> "Шесть",
         * если такого ключа не найдено, то он возвращает значение по умолчанию "0", который ему присвоили */
        map.getOrDefault("Шесть", "0");

        map.containsKey("Шесть"); // существует ли такой ключ? Возвращает Истину/Ложь
        map.containsValue("5"); // существует ли такое значение? Возвращает Истину/Ложь

        /* Запишет значение, если такого ключа не было. Если такое значение было, то он не будет ничего записывать.
        * Защитит вроде как, от случайных повторных записей. Возвращает Null, если ему не удалось сделать запись*/
        map.putIfAbsent("Шесть", "6");

        /* Работает не с итератором, а немного по другому. Мы описываем две локальные переменные просто буквами
        * (k, v) <- какие буквы будут, абсолютно не важно! Это просто название локальных переменных.
        * После стрелки(->) мы можем с ними что-нибудь сделать.
        * Это лямбда!*/
        map.forEach((k, v) -> System.out.println(k+" "+v));


        /* Если такого ключа нет, он ничего делать не будет и вернет Null. Если есть, то он произведет какие-то
         действия со значением, действия могут быть реально очень сложными и они учитывают и ключ и значение.
         Ключ менять нельзя, но учитывать можно */
        map.compute("Шесть", ((k, v) -> v+"!"));

         /* Если ключ существует, то он изменит у ключа значение, если нет, то ничего делать не будет*/
        map.computeIfPresent("Шесть", ((k, v) -> v+"!?"));

        /* Он сработает, если такого ключа нет. Здесь упрощенный синтаксис, тут не нужно писать ключ,
        здесь просто пишется значение */
        map.computeIfAbsent("Шесть", v -> v+"!?");


        // добавили ко всем значения ! знак
        for (String key: map.keySet()){
//            map.compute(key, (k, v) -> v+"!");
            map.merge(key, "!", String::concat); // тоже самое что и map.compute(key, (k, v) -> v+"!");
        }
        System.out.println(map);

        map.merge("Один", "7", String::concat);

        System.out.println(map);

        LinkedHashMap<String, String> hashMap = new LinkedHashMap<>();
        hashMap.put("Пять", "Five");
        hashMap.put("Два", "Two");
        hashMap.put("Один", "One");
        hashMap.putIfAbsent("Шесть", "6");
        System.out.println(hashMap);

        // хранит свои пары в виде дерева // скорость чтения не большая // сортирует ключи
        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("Пять", "Five");
        treeMap.put("Два", "Two");
        treeMap.put("Один", "One");
        treeMap.putIfAbsent("Шесть", "6");
        System.out.println(treeMap);

        TreeMap<Integer, String> treeMap2 = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        treeMap2.put(5, "Five");
        treeMap2.put(2, "Two");
        treeMap2.put(1, "One");
        treeMap2.putIfAbsent(6, "6");
        System.out.println(treeMap2.headMap(2, true));
        System.out.println(treeMap2.tailMap(2, false));

    }
}
