package in.balamt.practice.stream.intermediate.map;

import java.util.ArrayList;
import java.util.List;

public class StreamIntermediateMapApp {

    public static void main(String[] args){
        List<String> colors = new ArrayList<>();
        colors.add("Black");
        colors.add("Blue");
        colors.add("Red");
        colors.add("Yellow");
        
        colors.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
