package in.balamt.practice.designpattern.structural.facade;

public class HotelKeeper {
	//Menu for Veg
	public VegMenus getVegMenu() {
		return (VegMenus) new VegRestaurant().getMenus();
	}
	//Menu for NonVeg
	public NonVegMenus getNonVegMenu() {
		return (NonVegMenus) new NonVegRestaurant().getMenus();
	}
	//Menu for Both Veg and NonVeg
	public AllMenu getAllMenu() {
		return (AllMenu) new AllRestaurant().getMenus();
	}
}
