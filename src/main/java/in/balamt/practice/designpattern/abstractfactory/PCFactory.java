package in.balamt.practice.designpattern.abstractfactory;

public class PCFactory implements ComputerAbstractFactory {
	private String ram;
	private String hdd;
	public PCFactory(String ram, String hdd) {
		this.ram = ram;
		this.hdd = hdd;
	}	
	@Override
	public Computer buildComputer() {
		return new PC(ram, hdd);
	}
}
