package kr.ac.kopo.day08;

public class Employee_extends {
	String name;
	int salary;
	String grade;
	Employee(){
		//습관적으로 생성자 만들 때 기본적으로 생성자를 만들어줘야 한다. 
	}
	
	public Employee(String name, int salary, String grade) {
		this.name = name;
		this.salary = salary;
		this.grade = grade;
	}
	
	void info() {
		System.out.println("사원명 : " + name + ", 연봉 : " 
						+ salary + "만원, 직급 : " + grade);
	}
}


