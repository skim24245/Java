package kr.ac.kopo.day09.copy02;

class A {
	A() {
		System.out.println("A() 호출...");
	}
}

class B extends A {
	B() {
		super();//부모클래스의 A로 이동 
		System.out.println("B() 호출...");
	}
}

class C extends B {
	C() {
		super(); //부모클래스의 B로 이동 
		System.out.println("C() 호출...");
	}
}

public class lecture01 {

	public static void main(String[] args) {
	
//		new A();
//		new B();
		new C();
	}
}
