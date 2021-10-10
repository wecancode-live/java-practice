package in.balamt.practice.designpattern.facade;

public class AllRestaurant implements Hotel {
	@Override
	public Menus getMenus() {
		AllMenu allMenu = new AllMenu();
		allMenu.setMenu("Chicken Mushroom Briyani");
		return allMenu;
	}
}

