package Seminar6.HomeWork_S6;

import java.util.*;

public class HomeWork_S6 {

    public static void main(String[] args) {

        mySet mySet = new mySet();

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        };

        myTreeSet myTreeSet = new myTreeSet(comparator);

        for (int i = 0; i < 5; i++) {
            mySet.add(new Random().nextInt(10));
            myTreeSet.add(new Random().nextInt(10));
        }
        System.out.println("====================================");
        System.out.println(Arrays.toString(mySet.toArray()));
        System.out.println("------------------------------------");
        System.out.println("Множество mySet:");
        System.out.print("\tВсе элементы: ");
        Iterator<Integer> iterator = mySet.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println("\n\tЗначение под 3 индексом ==> " + mySet.getItem(3));
        System.out.println("\tСтрока со всеми элементами: " + mySet.toString().trim());
        System.out.println("------------------------------------");

        System.out.println("Множество myTreeSet(отсортированный):");
        System.out.print("\tВсе элементы: ");
        Iterator<Integer> iterator2 = myTreeSet.iterator();
        while (iterator2.hasNext()) {
            System.out.print(iterator2.next() + " ");
        }
        System.out.println("\n\tЗначение под 3 индексом ==> " + myTreeSet.getItem(3));
        System.out.println("\tСтрока со всеми элементами: " + myTreeSet.toString().trim());
        System.out.println("====================================");

    }

}

class mySet {
    static final Object OBJECT = new Object();
    private LinkedHashMap<Integer, Object> hashMap = new LinkedHashMap<>();

    public boolean add(int num) {
        return hashMap.put(num, OBJECT) == null;

    }

    public boolean contains(int num) {
        return hashMap.containsKey(num);
    }

    public Object[] toArray() {
        return hashMap.keySet().toArray();
    }

    public Iterator<Integer> iterator() {
        return hashMap.keySet().iterator();
    }

    public Integer getItem(int index) {
        return (Integer) toArray()[index];
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        for (Integer num : hashMap.keySet()
        ) {
            str.append(num.toString()).append("; ");

        }
        return str.toString();
    }
}

class myTreeSet {

    private Comparator<Integer> comparator;


    public myTreeSet(Comparator<Integer> comp) {
        comparator = comp;

    }
    static final Object OBJECT = new Object();
    private TreeMap<Integer, Object> treeMap = new TreeMap<>(comparator);

    public boolean add(int num) {
        return treeMap.put(num, OBJECT) == null;

    }

    public boolean contains(int num) {
        return treeMap.containsKey(num);
    }

    public Object[] toArray() {
        return treeMap.keySet().toArray();
    }

    public Iterator<Integer> iterator() {
        return treeMap.keySet().iterator();
    }

    public Integer getItem(int index) {
        return (Integer) toArray()[index];
    }
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (Integer num : treeMap.keySet()
        ) {
            str.append(num.toString()).append("; ");

        }
        return str.toString();
    }
}

