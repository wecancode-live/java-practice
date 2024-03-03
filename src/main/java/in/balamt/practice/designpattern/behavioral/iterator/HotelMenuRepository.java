package in.balamt.practice.designpattern.behavioral.iterator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class HotelMenuRepository implements MenuItemContainer {


    public MenuItem[] hotelMenus;

    HotelMenuRepository(){
        MenuItem m1 = new MenuItem(1L,"Dosa", 2.00);
        MenuItem m2 = new MenuItem(2L,"Idly", 1.10);
        MenuItem m3 = new MenuItem(3L,"Pongal", 2.10);
        MenuItem m4 = new MenuItem(4L,"Vada", 0.50);
        hotelMenus = new MenuItem[]{m1, m2, m3, m4};

    }

    @Override
    public MenuIterator getIterator() {
        return new HotelMenuIterator();
    }

    private class HotelMenuIterator implements MenuIterator {
        int index=0;
        @Override
        public boolean hasNext() {
            return (index < hotelMenus.length);
        }

        @Override
        public MenuItem getNext() {
            if(this.hasNext()){
                return hotelMenus[index++];
            }
            return null;
        }

        @Override
        public void reset() {
            index = 0;
        }
    }
}
