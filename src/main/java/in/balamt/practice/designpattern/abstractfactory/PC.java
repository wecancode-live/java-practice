package in.balamt.practice.designpattern.abstractfactory;

public class PC extends Computer {
	private String ram;
	private String hdd;
	public PC(String ram, String hdd) {
		//Constructor accepting the values
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
}
