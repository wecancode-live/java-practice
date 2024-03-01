package in.balamt.practice.designpattern.creational.builder;

public class BuilderApp {

	public static void main(String[] args) {

		// We have different builder to build different type of houses.
		StrawHouseBuilder strawHouseBuilder = new StrawHouseBuilder();

		// Engineer is only one person who can build us all the different houses.
		CivilEngineer engineer = new CivilEngineer(strawHouseBuilder);
		engineer.constructHouse();
		// We get the constructed House
		House house = engineer.getHouse();
		System.out.println("First Construction " + house.toString());

		// We want to have new house builder to build concrete house.
		ConcreteHouseBuilder concreteHouseBuilder = new ConcreteHouseBuilder();
		// We use the same engineer, but asking to build different house this time.
		engineer = new CivilEngineer(concreteHouseBuilder);
		engineer.constructHouse();
		house = engineer.getHouse();
		System.out.println("\n\nSecond Construction " + house.toString());

	}

}
