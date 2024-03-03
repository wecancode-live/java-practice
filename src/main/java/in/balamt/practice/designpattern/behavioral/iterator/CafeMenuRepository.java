package in.balamt.practice.designpattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class CafeMenuRepository implements MenuItemContainer {

    public List<MenuItem> cafeMenus;

    CafeMenuRepository(){
        if(cafeMenus == null){
            cafeMenus = new ArrayList<>();
            cafeMenus.add(new MenuItem(1L,"Coffee", 0.99));
            cafeMenus.add(new MenuItem(2L,"Tea", 0.79));
            cafeMenus.add(new MenuItem(3L,"Black Coffee", 2.10));
            cafeMenus.add(new MenuItem(4L,"Black Tea", 1.90));
        }
    }

    @Override
    public MenuIterator getIterator() {
        return new CafeMenuIterator();
    }

    private class CafeMenuIterator implements MenuIterator {
        int index;
        @Override
        public boolean hasNext() {
            return(index < cafeMenus.size());
        }

        @Override
        public MenuItem getNext() {
            if(this.hasNext()){
                return cafeMenus.get(index++);
            }
            return null;
        }

        @Override
        public void reset() {
            index = 0;
        }
    }
}
