package kr.ac.kopo.day08;

public class Employee {

	String 	name;
	int 	salary;
	String 	grade;
	static int employeeCnt;		// 총사원수 
	
	Employee() {
		Employee.employeeCnt++;
	}
	
	Employee(String name, int salary, String grade) {
		this.name = name;
		this.salary = salary;
		this.grade = grade;
		employeeCnt++;
	}
	
	void info() {
		System.out.println("사원명 : " + name 
				+ ", 연봉 : " + salary + "만원, 직급 : " + grade);
	}
	
	static void employeeCntInfo() {
		System.out.println("총 사원수 : " + Employee.employeeCnt + "명");
	}
}







