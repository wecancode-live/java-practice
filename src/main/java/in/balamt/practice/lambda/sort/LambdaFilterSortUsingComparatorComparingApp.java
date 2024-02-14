package in.balamt.practice.lambda.sort;

import in.balamt.practice.util.JavaPracticeLogger;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaFilterSortUsingComparatorComparingApp {
    public static void main(String[] args) {

        List<Item> items = new ArrayList<>();
        items.add(Item.builder().id(1).name("egg").price(7f).build());
        items.add(Item.builder().id(2).name("duck").price(700f).build());
        items.add(Item.builder().id(3).name("basket").price(128f).build());
        items.add(Item.builder().id(4).name("cake").price(450f).build());

        float maxPrice = 200;
        items.stream().filter(x ->
                x.getPrice() <= maxPrice)
                .sorted(Comparator.comparing(Item::getPrice))
                .collect(Collectors.toList())
                .forEach(JavaPracticeLogger::printLn);


    }

    @Data
    @Builder
    private static class Item {
        int id;
        String name;
        float price;
    }
}
