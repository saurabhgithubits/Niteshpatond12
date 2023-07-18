package Assig;

public class Employee {
	
	private int eId;
	
	private String eName;
	
	private int salary;
	
	private int age;

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Employee(int eId, String eName, int salary, int age) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.salary = salary;
		this.age = age;
	}

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", salary=" + salary + ", age=" + age + "]";
	}

	public int getSalary() {
		
		return salary;
	}
	
	

}
