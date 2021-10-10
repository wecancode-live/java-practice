package in.balamt.practice.designpattern.abstractfactory;

public class ComputerFactory {
	public static Computer constructComputer(ComputerAbstractFactory factory) {
		return factory.buildComputer();
	}
}
