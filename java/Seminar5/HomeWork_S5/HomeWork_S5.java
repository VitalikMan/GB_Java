package Seminar5.HomeWork_S5;

import java.util.*;

/**
 * Создать множество: ключ и значение строки.
 * Добавить шесть элементов. Вывести в консоль значения.
 * Добавить ко всем значениям символ "!".
 * Создать второе множество с таким же обобщением.
 * Ключи второго множества частично совпадают с ключами первого.
 * Объединить значения во втором множестве и первом, если ключи совпадают. Вывести результат в консоль.
 */
public class HomeWork_S5 {
    public static <str, MapEntry> void main(String[] args) {

        HashMap<String, String> map1 = new HashMap<>();  // создали множество и добавили шесть элементов
        map1.put("Шесть", "Six");
        map1.put("Четыре", "Four");
        map1.put("Пять", "Five");
        map1.put("Три", "Three");
        map1.put("Один", "One");
        map1.put("Два", "Two");

        System.out.println();
        for (int i = 0; i < 76; i++) { // разделил вывод в консоли
            System.out.print("=");
        }
        System.out.println();

        // вывели в консоль значения первого множества
        System.out.println(" Создали первое множество:\n" + "\t" + map1);

        for (int i = 0; i < 76; i++) { // разделил вывод в консоли
            System.out.print("-");
        }
        System.out.println();

        // добавили ко всем значения ! знак
        System.out.println(" Добавляем ко всем значениям первого множества, знак << ! >>:");
        for (String key: map1.keySet()){
            map1.compute(key, (k, v) -> v+"!");
        }
        System.out.println("\t" + map1);

        for (int i = 0; i < 76; i++) { // разделил вывод в консоли
            System.out.print("-");
        }
        System.out.println();

        HashMap<String, String> map2 = new HashMap<>();  // создали второе множество и добавили шесть элементов
        map2.put("6", "Six");
        map2.put("Четыре", "4");
        map2.put("5", "Five");
        map2.put("Три", "3");
        map2.put("1", "One");
        map2.put("Два", "2");

        // вывели в консоль значения второго множества
        System.out.println(" Создали второе множество:\n" + "\t" + map2);

        for (int i = 0; i < 76; i++) { // разделил вывод в консоли
            System.out.print("-");
        }
        System.out.println();

        /* Объединяем значения во втором множестве и первом, если ключи совпадают. Выводим результат в консоль.*/
        Map<String, String> result = new HashMap<>();
        for (String key: map2.keySet()) {
            if (map1.containsKey(key)) {
                String value1 = map1.get(key);
                String value2 = map2.get(key);
                String newValue = value1 + value2;
                result.put(key, newValue);
            }
        }
        System.out.println("   Объединяем значения во втором множестве и первом, если ключи совпадают");

        for (int i = 0; i < 76; i++) { // разделил вывод в консоли
            System.out.print("-");
        }
        System.out.println();

        System.out.println(" Результат слияния:\n" + "\t" + result);

        for (int i = 0; i < 76; i++) { // разделил вывод в консоли
            System.out.print("=");
        }
        System.out.println();




    }
}
