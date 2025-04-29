package ListMapSet;

import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        System.out.println(list);

        list.remove("apple");
        list.add("banana");
        list.add("apple");

        for (String s : list) {
            System.out.println(s);
        }

        List<Integer> numList = new ArrayList<>();

        for (int i = 1; i < 11; i++) {
            numList.add(i);
        }
        for (Integer i : numList) {
            System.out.print(i);
            System.out.print(" ");
        }

    }
}
