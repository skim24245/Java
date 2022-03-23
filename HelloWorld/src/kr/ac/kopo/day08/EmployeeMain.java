package kr.ac.kopo.day08;

public class EmployeeMain {

		public static void main(String[]args) {
			//회사 입장에서 입사한 사원수가 총 몇명인지 알고 싶을 때
			
			System.out.println("총사원수 : " + Employee.employeeCnt + "명"); //static으로 접근하는 방법은 class이기 때뭉네 대문자로 씀
			Employee e = new Employee("홍길동", 3300, "사원"); 
			Employee e2= new Employee("강길동", 3800, "대리");
			
			e.info(); //사원객체를 만들고 출력하겠다는 뜻. 
			e.emplyeeCntInfo(); //e에 접근한다는 뜻은 non - > static으로 접근할 수 있음. static은 이미 생성이 되어 있기 때문에 instacne에서 class로 접근이 가능함. 
			e2.info();
			E.emplyeeCntinfo();// 
			Employee.employeeCntInfo();
			//e.name = " "; 이렇게 써주는 건 좋은 게 아님. 일방적으로는 자신의 멤버변수를 acess할 때에는 자신의 클래스 내에서만 access 하는 것이 좋은 코드임. 
		
			System.out.println("입사한 총 사원수  : " + totalEmployee + "명"); //employee 클래스와 관련있는 변수이기 때문에 emplyee 클래스 내부에 총 사원수를 써주는 것임.
		}
			//서로 관련이 있는 애들끼리 묶어서 사용하고 싶을 때 static을 쓴다. 멤버변수는 항상 클래스 안에 정의되어야 함. 




