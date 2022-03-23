package kr.ac.kopo.day08;

public class EmployeeREview {

		String 	name;
		int 	salary;
		String 	grade;
		static int employeeCnt;		// 총사원수 
		
		Employee() {
			Employee.employeeCnt++; ///이렇게 기본 생성자를 만들었음. 오류를 줄이기 위해
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


