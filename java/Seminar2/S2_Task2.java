package Seminar2;


/*
Первое задание:
 * Основание -5, стапень 3, результат равен
 * Основание 127, стапень 2, результат равен
 * Основание 33, стапень 15, результат равен
 * Основание 4, стапень 7, результат равен
 */
public class S2_Task2 {


    public static void main(String[] args) {

        print_string("Основание -5, стапень 3, результат равен");
        print_string("Основание 127, стапень 2, результат равен");
        print_string("Основание 33, стапень 15, результат равен");
        print_string("Основание 4, стапень 7, результат равен");

    }

    private static void print_string(String s) {

        String[] m1 = s.split(", ");
        String[] m1_1 = m1[0].split(" ");
        String[] m1_2 = m1[1].split(" ");

        String a = m1_1[1];
        int a_int = Integer.parseInt(a);

        String b = m1_2[1];
        Integer b_int = Integer.parseInt(b);

        Double result = Math.pow(a_int, b_int);
        System.out.println("Основание " + a + ", степень " + b + ", результат равен " + Math.round(result));

    }

}