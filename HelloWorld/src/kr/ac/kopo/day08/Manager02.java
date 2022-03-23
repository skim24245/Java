package kr.ac.kopo.day08;

//관리자는 사원의 한 형태다 조건 부합 => 상속관계 표현 

public class Manager02 extends Employee {
//manager에 있으므로 똑같은 변수 쓸 필요 없음.
	
	Employee[] empList;	// 관리사원목록
	//employee 공간을 먼저 만들어주고 super라는 생성자를 호출. 그런데 employee 클래스에 가보면 기본 생성자가 없으므로 오류가 뜨는 것 
	Manager02() {} //이렇게 기본 생성자를 만들고 놔야지 에러가 안뜬다. 항상 명심하기! 
	Manager02 (String name, int salary, String grade, Employee[] empList) {
		this.name = name;
		this.salary = salary;
		this.grade = grade;
		this.empList = empList;
	}
	
	void info() {
		System.out.println("사원명 : " + name 
				+ ", 연봉 : " + salary + "만원, 직급 : " + grade);
		
		System.out.println("------------------------------------------");
		System.out.println("\t관리사원 목록");
		System.out.println("------------------------------------------");
		for(Employee e : empList) {
			e.info();
		}
		System.out.println("------------------------------------------");
	}
}