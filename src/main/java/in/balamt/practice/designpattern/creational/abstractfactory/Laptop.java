package in.balamt.practice.designpattern.creational.abstractfactory;

public class Laptop extends Computer {
	private String ram;
	private String hdd;

	public Laptop(String ram, String hdd) {
		this.ram = ram;
		this.hdd = hdd;
	}
	@Override
	public String getRAM() {
		return this.ram;
	}
	@Override
	public String getHDD() {
		return this.hdd;
	}

	@Override
	public String getType() {
		return "Laptop";
	}
}
