package app.task1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
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
}
