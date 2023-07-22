package app.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        System.out.println("Initial list:");
        getOutput(showList( getData()));
        System.out.println("Sorted list:");
        getOutput(showList(getSort(getData())));
    }

    public static ArrayList<String> getData(){
        return new ArrayList<>(Arrays.asList("John","Alice","Robert",
                "Lise","David","Amanda"));
    }

    public static String showList(ArrayList<String> list){
        StringBuilder result = new StringBuilder();
        int count = 0;
        for (String name : list) {
            count++;
            result.append(count).append(") ").append(name).append(" \n");
        }
        return result.toString();
    }

    public static ArrayList<String> getSort(ArrayList<String> list){
        list.sort(Comparator.naturalOrder());
        return list;

    }

    public static void getOutput(String output){
        System.out.println(output);
    }
}
