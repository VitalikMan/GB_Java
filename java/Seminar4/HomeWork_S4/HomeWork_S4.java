package Seminar4.HomeWork_S4;

import java.util.ArrayList;
import java.util.Scanner;

public class HomeWork_S4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> general_list = new ArrayList<>();     // общий список
        ArrayList<String> list_lastname = new ArrayList<>();    // список имен
        ArrayList<String> list_firstname = new ArrayList<>();   // список фамилий
        ArrayList<String> list_patronimyc = new ArrayList<>();  // список отчеств
        ArrayList<Integer> list_age = new ArrayList<>();        // список возраста
        ArrayList<String> list_gender = new ArrayList<>();      // список пола
        ArrayList<Integer> list_id = new ArrayList<>();         // список id

        String in = scanner.nextLine();

        System.out.println("\nОригинальный список:");
        int id_count = 0;
        while (!in.equals("q")) {
            System.out.println('\t' + in);
            String[] val = new String[general_list.size()];
            val = in.split(" ");
            general_list.add(in);
            list_lastname.add(val[0]);
            list_firstname.add(val[1]);
            list_patronimyc.add(val[2]);
            list_age.add(Integer.parseInt(val[3]));
            list_gender.add(String.valueOf(val[4].charAt(0)));
            list_id.add(id_count++);
            in = scanner.nextLine();
        }

        ArrayList<Integer> sorted_list_age = new ArrayList<>(list_age);             // сортированный список возраста
        ArrayList<Integer> sorted_list_id = new ArrayList<>(list_id);               // сортированный список id

        int temp = 0;
        boolean isSorted = true;
        while (isSorted) {
            for (int i = 0; i < sorted_list_age.size() - 1; i++) {
                isSorted = false;
                if (sorted_list_age.get(i) >= sorted_list_age.get(i + 1)) {
                    temp = sorted_list_age.get(i);
                    sorted_list_age.set(i, sorted_list_age.get(i + 1));
                    sorted_list_age.set(i + 1, temp);
                    temp = sorted_list_id.get(i);
                    sorted_list_id.set(i, sorted_list_id.get(i + 1));
                    sorted_list_id.set(i + 1, temp);
                    isSorted = true;
                }

            }
        }
        System.out.println("\nСортировка по возрасту:");
        for (int i : sorted_list_id) {
            System.out.println('\t' + general_list.get(i));
        }


    }
}