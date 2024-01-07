package in.balamt.practice.stream.intermediate.flatmap;

import java.util.ArrayList;
import java.util.List;

public class StreamIntermediateFlatMapApp {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Black");
        colors.add("Blue");
        colors.add("Red");
        colors.add("Yellow");

        colors.stream()
                .flatMap(String::toLowerCase)
    }
}
