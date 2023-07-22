package app.task3;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {

    public static LinkedList<String> getData(){
        return new LinkedList<>(Arrays.asList("orange", "grape", "apple","lemon"));
    }

    public static String showList(LinkedList<String> list){
        StringBuilder result = new StringBuilder();
        int count = 0;
        for (String name : list) {
            count++;
            result.append(count).append(") ").append(name).append(" \n");
        }
        return result.toString();
    }

    public static LinkedList<String> getProduct(LinkedList<String> list){
        list.add(0, "plum");
        list.add(5, "mango");
        return list;
    }
}
