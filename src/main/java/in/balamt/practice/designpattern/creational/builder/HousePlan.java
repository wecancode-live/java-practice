package in.balamt.practice.designpattern.creational.builder;
//This is base for all the house
public interface HousePlan {

	public void setBasement(String basement);

	public void setStructure(String structure);

	public void setRoof(String roof);

	public void setInterior(String interior);

}
