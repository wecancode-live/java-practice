package in.balamt.practice.stream.intermediate.flatmap;

import in.balamt.practice.util.JavaPracticeLogger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class StreamIntermediateFlatMapApp {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Black");
        colors.add("Blue");
        colors.add("Red");
        colors.add("Yellow");

        List<List<String>> colorList = new ArrayList<>();
        colorList.add(colors);

//        colors.stream()
//                .map(x -> x.split(""))
//                .flatMap(Arrays::stream)
//                .forEach(System.out::println);

        String[] vowels = {"a","e","i","o","u"};

        colors.stream()
                .map(x -> x.split(""))
                .flatMap(Arrays::stream)
                .map(x -> {
                    if(Arrays.asList(vowels).contains(x)){
                        return "";
                    }
                    return x;
                })
                .forEach(JavaPracticeLogger::printLn);

        colorList.stream()
                .flatMap(Collection::stream)
                .forEach(JavaPracticeLogger::printLn);

    }
}
