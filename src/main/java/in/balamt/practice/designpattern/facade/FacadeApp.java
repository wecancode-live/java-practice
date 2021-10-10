package in.balamt.practice.designpattern.facade;

public class FacadeApp {

	public static void main(String[] args) {
		HotelKeeper keeper = new HotelKeeper();

		AllMenu allMenu = keeper.getAllMenu();
		NonVegMenus nonVegMenu = keeper.getNonVegMenu();
		VegMenus vegMenu = keeper.getVegMenu();
		
		System.out.println("All " + allMenu.getMenu());
		System.out.println("Is NonVeg " + nonVegMenu.isNonVeg);
		System.out.println("NonVeg " + nonVegMenu.getMenu());
		System.out.println("Is Veg " + vegMenu.isVeg);
		System.out.println("Veg " + vegMenu.getMenu());
	}
}
