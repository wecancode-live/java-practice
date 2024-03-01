package in.balamt.practice.designpattern.creational.abstractfactory;

public class ComputerFactory {
	public static Computer constructComputer(ComputerAbstractFactory factory) {
		return factory.buildComputer();
	}
}
