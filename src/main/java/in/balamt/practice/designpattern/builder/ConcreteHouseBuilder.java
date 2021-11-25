package in.balamt.practice.designpattern.builder;

public class ConcreteHouseBuilder implements HouseBuilder {

	private House house;

	public ConcreteHouseBuilder() {
		this.house = new House();
	}

	@Override
	public void buildBasement() {
		this.house.setBasement("Concrete and TMT Bars!!");
	}

	@Override
	public void buildStructure() {
		this.house.setStructure("Pillars with Concrete and TMT Bars!");
	}

	@Override
	public void buildRoof() {
		this.house.setRoof("Cement Sheets for the Roof!");
	}

	@Override
	public void buildInterior() {
		this.house.setInterior("Painted with White and Violet! and Floors are made of Ceramic!");
	}

	@Override
	public House getHouse() {
		return this.house;
	}

}
