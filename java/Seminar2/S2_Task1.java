package Seminar2;

public class S2_Task1 {

    public static void main(String[] args) {

        String a = "Hello";
        long begin = System.currentTimeMillis();

        for (int i = 0; i < 30000; i++) {
            a += Character.getName(i);
        }

        long end = System.currentTimeMillis();
        System.out.println(end - begin);

        StringBuilder builder = new StringBuilder("Hello World");

        begin = System.currentTimeMillis();
        for (int i = 0; i < 30000; i++) {
            builder.append(Character.getName(i));
        }
        end = System.currentTimeMillis();
        System.out.println(end - begin);

        builder.delete(0, builder.length() / 2);
        builder.insert(2, .43f);
        builder.deleteCharAt(3);
        builder.reverse();
        builder.indexOf("Hel");
        builder.lastIndexOf("l");
        builder.replace(1, 5, "235");
        builder.charAt(0);
        System.out.println(builder.toString());
    }
}