package Seminar1;

import java.util.Arrays;
import java.util.Random;

public class S1_Task2 {
    public static void main(String[] args) {
        int i;
        String[] i_string; // первое задание
        Random random = new Random();
        i = random.nextInt(10000);

        System.out.println(i);
        i_string = String.valueOf(i).split("");
        System.out.println(Arrays.toString(i_string));
        for (int j = i_string.length - 1; j >= 0; j--) {
            System.out.print(i_string[j]);
        }

        System.out.println(); /// второе задание
        String fio = "Иванов Петр Григорьевич";
        String result;
        String[] fio_array = fio.split(" ");
        System.out.println(Arrays.toString(fio_array));
        result = fio_array[0] + ' ' + fio_array[1].charAt(0) + '.' + fio_array[2].charAt(0) + '.';
        System.out.println(result);

    }
}