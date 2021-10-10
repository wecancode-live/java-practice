package in.balamt.practice.designpattern.abstractfactory;

//Abstract Class
public abstract class Computer {
	
	public abstract String getRAM();
	public abstract String getHDD();
	
	@Override
	public String toString() {
		return String.format("Ram=%s | HDD=%s", this.getRAM(), this.getHDD());
	}
}
