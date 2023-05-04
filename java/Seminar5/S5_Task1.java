package Seminar5;

import java.util.*;

public class S5_Task1 {

    public static void main(String[] args) {

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
//        }
//
//        Iterator<String> iterator = map.keySet().iterator();
//        while (iterator.hasNext()){
//            String key = iterator.next();
//            System.out.println(map.get(key));
//        }
//
//
//        Set keys = map.keySet();
//        for (int i = 0; i < keys.size(); i++) {
//            System.out.println(map.get(keys.toArray()[i]));
//        }

        map.replace("Пять", "5");
        map.replace("Пять", "Five", "5");

        map.getOrDefault("Шесть", "0");
        map.containsKey("Шесть"); // есть ли такой ключ
        map.containsValue("5"); // есть ли такое значение
        map.putIfAbsent("Шесть", "6"); // если такое значение было, то он не будет ничего записывать
        map.forEach((k, v) -> System.out.println(k+" "+v)); //

        //
        map.compute("Шесть", ((k, v) -> v+"!"));

        // если такого ключа нет, он ничего делать не будет, если есть, он его изменит
        map.computeIfPresent("Шесть", ((k, v) -> v+"!?"));

        //
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
