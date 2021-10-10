package in.balamt.practice.equal;

public class EqualApp {

	public static void main(String[] args) {

		EmployeePOJO emp1 = new EmployeePOJO();
		EmployeePOJO emp2 = new EmployeePOJO();

		EmployeePOJO emp3 = emp2;

		emp1.setEmpId(100);
		emp1.setName("Harold");

		emp2.setEmpId(100);
		emp2.setName("Kumar");

		System.out.println("emp1 Equals emp2 " + emp1.equals(emp2)); //Since we have override the equals and checking only the empId this is true
		System.out.println("emp1 == emp2 " + (emp1 == emp2)); //False because the == operator check for value
		System.out.println("emp2 == emp3 " + (emp2 == emp3));//True because the object's has reference to the same object.

	}

}

class EmployeePOJO {
	int empId;
	String name;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if (this.getEmpId() == (((EmployeePOJO) obj).getEmpId())) {
			return true;
		} else {
			return false;
		}
	}
}
