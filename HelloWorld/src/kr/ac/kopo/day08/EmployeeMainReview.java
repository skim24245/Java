package kr.ac.kopo.day08;

public class EmployeeMainReview {
	public static void main(String[] args) {

//		System.out.println("총사원수 : " + Employee.employeeCnt + "명");
		Employee.employeeCntInfo(); //클래스로 접근하니 대문자
	
		
		Employee e = new Employee("홍길동", 3300, "사원");
		Employee e2 = new Employee("강길동", 3800, "대리");
				
		e.info();
		e2.info();
		
		Employee.employeeCntInfo(); //클래스로 접근하니 대문자
		//함부로 메소드명을 수정할 수 없음.
		
	}
}

}
