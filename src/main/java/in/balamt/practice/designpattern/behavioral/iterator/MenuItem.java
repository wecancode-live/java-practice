package in.balamt.practice.designpattern.behavioral.iterator;

public class MenuItem {
    long menuId;
    String menu;
    double price;
    MenuItem(){

    }

    MenuItem(long menuId, String menu, double price){
        this.menuId = menuId;
        this.menu = menu;
        this.price = price;
    }

    public String print() {
        return new StringBuilder("[Menu ID: ").append(this.menuId)
                .append(", Name: ")
                .append(this.menu)
                .append(", Price ")
                .append(this.price)
                .append(" ]").toString();
    }
}
