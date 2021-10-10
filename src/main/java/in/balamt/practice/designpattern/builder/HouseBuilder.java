package in.balamt.practice.designpattern.builder;

//More generic builder for all the house
public interface HouseBuilder {

	public void buildBasement();

	public void buildStructure();

	public void buildRoof();

	public void buildInterior();

	public House getHouse();

}
