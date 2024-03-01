package in.balamt.practice.designpattern.creational.abstractfactory;

//Abstract Class
public abstract class Computer {
	
	public abstract String getRAM();
	public abstract String getHDD();
	public abstract String getType();
	
	@Override
	public String toString() {
		return String.format("Ram=%s | HDD=%s | Type=%s", this.getRAM(), this.getHDD(), this.getType());
	}
}
