package kr.ac.kopo.day08;


//	Employee(String name, int salary, String grade){ //employee라는 생성자를 만들면서 매개변수를 넣어줄 땐, 매개변수가 없는 기본 생성자까지 만들어주는 것이 좋음.
//		this.name = name; //사원의 이름이 있을 수 있고
//		this.Salary = Salary; // 연봉이 있을 수 있고 
//		this.grade = grade;
//	}
//
//public class Employee {
//
//	String 	name; //클래스 내에 멤버변수라 파란색으로 보임
//	int 	salary;//클래스 내에 멤버변수라 파란색으로 보임
//	String 	grade;// 클래스 내에 멤버변수라 파란색으로 보임
//	static int employeeCnt; //employee 클래스 안에 하나의 집단인 총 직원수를 알고 싶으니 emplyoee 클래스 내부에서 쓰고 static을 붙여줌. static을 붙이는 순간 각각 instace에 employee가 하나씩 별도로 만들어지는 것이 아니라, employee 클래스에 속해있는 
//	// employeecnt라는 변수가 있음.
//	
//	
//	Employee(String name, int salary, String grade) {
//		this.name = name;
//		this.salary = salary;
//		this.grade = grade;
//		employeeCnt++;
//	}
//	
//	void info() {
//		System.out.println("사원명 : " + name + ", 연봉 : " + salary + "만원, 직급 : " + grade);
//	}
//	static void emplyeeCntinfo() {
//		System.out.println("총 사원수 : " + employeeCnt + "명"); 
//		
//	}
//}

public class Employee {

	public static void main(String[] args) {

//		System.out.println("총사원수 : " + Employee.employeeCnt + "명");
		Employee.employeeCntInfo();
		
		Employee e = new Employee("홍길동", 3300, "사원");
		Employee e2 = new Employee("강길동", 3800, "대리");
				
		e.info();
		e2.info();
		
		Employee.employeeCntInfo();
	
		
	}
}

//클래스 변수나 클래스 메소드는 클래스 이름을 앞에다가 써주는게 좋음. 
