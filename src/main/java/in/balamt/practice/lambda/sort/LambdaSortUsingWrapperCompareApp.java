package in.balamt.practice.lambda.sort;

import in.balamt.practice.util.JavaPracticeUtils;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

public class LambdaSortUsingWrapperCompareApp {
    public static void main(String[] args) {

        List<Item> items = new ArrayList<>();
        items.add(Item.builder().id(1).name("egg").price(7f).build());
        items.add(Item.builder().id(2).name("duck").price(700f).build());
        items.add(Item.builder().id(3).name("basket").price(128f).build());
        items.add(Item.builder().id(4).name("cake").price(450f).build());

        //Using Static method referencing
        items.sort(LambdaSortUsingWrapperCompareApp::comparePrice);
        JavaPracticeUtils.print(items);

        //Using Static method referencing in reverse order
        items.sort(LambdaSortUsingWrapperCompareApp::comparePriceReverse);
        JavaPracticeUtils.print(items);

        //Using lambda with custom implementation
        items.sort(
                (Item i, Item j) ->
                        (int) (i.getPrice() - j.getPrice())
        );

        JavaPracticeUtils.print(items);

    }

    public static int comparePrice(Item i, Item j){
        return Float.compare(i.getPrice(), j.getPrice());
    }

    public static int comparePriceReverse(Item i, Item j){
        return Float.compare(j.getPrice(), i.getPrice());
    }

    @Data
    @Builder
    private static class Item {
        int id;
        String name;
        float price;
    }
}
