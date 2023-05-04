package Seminar4;

import java.util.*;

public class S4_Task1 {

    public static void main(String[] args) {

//        java программа попросит ввести данные о пользователях ФИО, возраст и пол,
//        сложит инфо в структуры данных и выведет инфо отсортированную по возрасту,
//        по полу и красивый вывод

        ArrayList<String> lastname = new ArrayList<>();
        ArrayList<String> firstname = new ArrayList<>();
        ArrayList<String> patronimyc = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<Character> gender = new ArrayList<>();
        LinkedList<Integer> id = new LinkedList<>();

        Scanner scanner = new Scanner(System.in); // Иванов Иван Степанович 16 M
        String line = scanner.nextLine();
        int id_count = 0;

        while (!line.equals("q")) {
            String[] strings = line.split(" ");
            lastname.add(strings[0]);
            firstname.add(strings[1]);
            patronimyc.add(strings[2]);
            age.add(Integer.valueOf(strings[3]));
            gender.add(strings[4].charAt(0));
            id.add(id_count++);
            line = scanner.nextLine();
        }

        for (int i = 0; i < age.toArray().length - 1; i++) {
            if (age.get(i) > age.get(i + 1)) {
                int temp = id.get(i);
                id.set(i, id.get(i + 1));
                id.set(i + 1, temp);
            }
        }


//        private static void sortIndexesByIntList(ArrayList<Integer> arrayToSort, LinkedList<Integer> ind) {
//            ArrayList<Integer> arr = new ArrayList<>(arrayToSort);
//
//            for (int i = 0; i < arr.size(); i++) {
//                for (int j = 0; j < arr.size() - 1; j++) {
//                    if (arr.get(j) > arr.get(j + 1)) {
//                        int tmp = ind.get(j);
//                        ind.set(j, ind.get(j + 1));
//                        ind.set(j + 1, tmp);
//
//                        tmp = arr.get(j);
//                        arr.set(j, arr.get(j + 1));
//                        arr.set(j + 1, tmp);
//                    }
//                }
//            }
//        }

    }
}