package app.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

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
}
