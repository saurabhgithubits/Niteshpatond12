package Assig;

public class Student implements Comparable<Student>{
	
	private int stdId;
	
	private String stdName;
	
	public void setId(int stdId) {
		this.stdId = stdId;
	}
	
	public int getId() {
		return stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	
	public Student() {
		super();
	}
	public Student(int stdId, String stdName) {
		this.stdId = stdId;
		this.stdName=stdName;
	}
	
	public String toString() {
		return "[ Student :  Id : " + stdId + ", Name : " + stdName + "]";
		
	}

	@Override
	public int compareTo(Student o) {
		if(this.stdName.compareToIgnoreCase(o.getStdName())>0) {
		return 1;	
		}else
		{
		return -1;
		}
	}

}
