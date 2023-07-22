package app.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Initial list:");
        getOutput(showList(getData()));
        System.out.println("List part:");
        getOutput(showList( getSort(getData())));
    }

    public static List<String> getData(){
        return new ArrayList<>(Arrays.asList("orange", "mango","banana",
                "apple","kiwi","cherry"));
    }

    public static String showList(List<String> list){
        StringBuilder result = new StringBuilder();
        int count = 0;
        for (String name : list) {
            count++;
            result.append(count).append(") ").append(name).append(" \n");
        }
        return result.toString();
    }

    public static List<String> getSort(List<String> list){
        return  list.subList(1,3);
    }

    public static void getOutput(String output){
        System.out.println(output);
    }
}
