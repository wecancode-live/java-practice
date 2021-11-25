package in.balamt.practice.designpattern.abstractfactory;

public class LaptopFactory implements ComputerAbstractFactory {
	private String ram;
	private String hdd;
	private String type = "Laptop";
	public LaptopFactory(String ram, String hdd) {
		this.ram = ram;
		this.hdd = hdd;
	}
	@Override
	public Computer buildComputer() {
		return new Laptop(ram, hdd);
	}
}
