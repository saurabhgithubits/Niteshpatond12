package Assig;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test implements Comparator<Employee>{
	public static void main(String[] args) {
		
		System.out.println("");
		System.out.println("=========== 1st Sort by salary ============================================");
		System.out.println("");
		
		List<Employee> list = Arrays.asList(new Employee(12,"saurabh" , 24000,24), new Employee(3,"yadnesh" , 44000,26)
				, new Employee(6,"kunal" , 28000,24), new Employee(10,"nitesh" , 25000,28));
		
		Collections.sort(list, new Test());
		
		for(int i =0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("");
		System.out.println("================ 2nd Sort by name ====================================");
		System.out.println("");
		
		List<Student> li = Arrays.asList(new Student(10, "nitesh"), new Student(11, "saurabh"), new Student(12, "kunal"), new Student(13, "yadnesh")
				, new Student(14, "shubham"));
		
		Collections.sort(li);
		
		for(int j = 0; j<li.size();j++) {
			System.out.println(li.get(j));
		}

		
		System.out.println("");
		System.out.println("================ 3nd Sort by age ====================================");
		System.out.println("");
		
		
		List<Department> department = Arrays.asList(new Department(13, "IT Department", new Employee(12,"saurabh" , 24000,42)), new Department(14, "saleforce", new Employee(3,"yadnesh" , 44000,62))
			, new Department(15, "service",new Employee(6,"kunal" , 28000,24)), new Department(16, "Management", new Employee(10,"nitesh" , 25000,61)));
		
		
		List<Department> list1 = new ArrayList<>();
		for(Department departmen : department) {
			Employee employee = departmen.getEmployee();
			if(employee.getAge() >= 60) {
				list1.add(departmen);
			}
		}
		
		for(Department department1 : list1) {
			Employee employee = department1.getEmployee();
			
			System.out.println("Department Id : "+department1.getdId());
			System.out.println("Department Name : "+department1.getdName());
			System.out.println("Employee Id : "+employee.geteId());
			System.out.println("Employee Name : "+employee.geteName());
			System.out.println("Employee salary  : " +employee.getSalary());
			System.out.println("Employee age : " + employee.getAge());
		
			System.out.println("====================================================");
		}
		
		
	}

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getSalary()>o2.getSalary()) {
		return -1;
	}else
	{
	return 1;	
	}
	}

}
