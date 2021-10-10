package in.balamt.practice.designpattern.abstractfactory;

public class AbstractFactoryApp {

	public static void main(String[] args) {
		Computer laptop = ComputerFactory.constructComputer(
				new LaptopFactory("32G", "1TB"));
		
		Computer pc = ComputerFactory.constructComputer(
				new PCFactory("16G", "500GB"));
		
		System.out.println("Laptop " + laptop.toString());
		System.out.println("PC " + pc.toString());
	}

}
