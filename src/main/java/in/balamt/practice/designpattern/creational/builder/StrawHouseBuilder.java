package in.balamt.practice.designpattern.creational.builder;

public class StrawHouseBuilder implements HouseBuilder {

	private House house;

	public StrawHouseBuilder() {
		this.house = new House();
	}

	@Override
	public void buildBasement() {
		this.house.setBasement("Cement and Bars");
	}

	@Override
	public void buildStructure() {
		this.house.setStructure("Pillar with Bamboo! and Covering with Straws!");

	}

	@Override
	public void buildRoof() {
		this.house.setRoof("Roof with more Straws!!");
	}

	@Override
	public void buildInterior() {
		this.house.setInterior("Interior with wooden plank!!");
	}

	@Override
	public House getHouse() {
		return this.house;
	}

}
