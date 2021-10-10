package in.balamt.practice.designpattern.facade;

public class NonVegRestaurant implements Hotel {
	@Override
	public Menus getMenus() {
		NonVegMenus nvMenu = new NonVegMenus();
		nvMenu.setMenu("Chicken 65");
		return nvMenu;
	}
}
