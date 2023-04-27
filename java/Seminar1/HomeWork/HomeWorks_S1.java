/*Первый семинар.
        1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
        2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
        3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
        4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2

        Пункты реализовать в методе main
        *Пункты реализовать в разных методах

        int i = new Random().nextInt(k); //это кидалка случайных чисел!)*/

package Seminar1.HomeWork;
import java.util.Arrays;
import java.util.Random;

public class HomeWorks_S1 {

    public static void main(String[] args) {

        int i = new Random().nextInt(0, 2001);
        System.out.print("Число i: ");
        System.out.println(i);

        String j = Integer.toBinaryString(i);
        //System.out.println(j);

        int n = j.length()-1;
        System.out.print("Номер старшего значащего бита числа i: ");
        System.out.println(n);

        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        for (int a = i; a < Short.MAX_VALUE; a++){
            if (a%n == 0){
                s1.append(a);
                s1.append(" ");
            }
        }

        for (int b = Short.MIN_VALUE; b < i; b++){
            if (b%n != 0){
                s2.append(b);
                s2.append(" ");
            }
        }
        //System.out.println(s1);
        String SS1 = s1.toString();
        //System.out.println(SS1);
        String [] m1 = SS1.split(" ");
        System.out.print("Массив m1: ");
        System.out.println(Arrays.toString(m1));

        //System.out.println(s2);
        String SS2 = s2.toString();
        //System.out.println(SS2);
        String [] m2 = SS2.split(" ");
        System.out.print("Массив m2: ");
        System.out.println(Arrays.toString(m2));

    }
}