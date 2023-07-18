package Assig;

public class Department {
	
	private int dId;
	
	private String dName;
	
	private Employee employee;


	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public int getdId() {
		return dId;
	}

	public void setdId(int dId) {
		this.dId = dId;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public Department(int dId, String dName, Employee employee) {
		super();
		this.dId = dId;
		this.dName = dName;
		this.employee = employee;
	}

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Department [dId=" + dId + ", dName=" + dName + ", employee=" + employee + "]";
	}

	public Employee getEmployee() {
		
		return employee;
	}

}
