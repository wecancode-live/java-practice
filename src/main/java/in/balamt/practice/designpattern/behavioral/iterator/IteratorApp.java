package in.balamt.practice.designpattern.behavioral.iterator;

import in.balamt.practice.util.JavaPracticeUtils;

import javax.sound.midi.Soundbank;

public class IteratorApp {

    public static void main(String[] args) {
        //CafeMenu Powered by ArrayList
        CafeMenuRepository cafeMenuRepository = new CafeMenuRepository();

        for(MenuIterator itr = cafeMenuRepository.getIterator(); itr.hasNext();) {
            JavaPracticeUtils.printLine(itr.getNext().print());
        }

        //HotelMenu Powered by Arrays
        HotelMenuRepository hotelMenuRepository = new HotelMenuRepository();

        for(MenuIterator itr = hotelMenuRepository.getIterator(); itr.hasNext();) {
            JavaPracticeUtils.printLine(itr.getNext().print());
        }
    }
}
