package kr.ac.kopo.day09묵시적;

import kr.ac.kopo.day09.copy02.Parent;


public class CastMain01 {

	/*
	public static void print(Child01 c) {
		c.print();
	}
	
	public static void print(Child02 c) {
		c.print();
	}
	*/
	public static void print(Parent p) { //묵시적 형변환처럼 보이진 않지만 실제로는 묵시적 형변환처럼 일어나고 있는 것처럼 보임. 
		p.print();
	}
	
	public static void main(String[] args) {
		
		Child01 c01 = new Child01();
		print(c01);
		
//		Child01 c01 = new Child01();
//		c01.print();
		
		Child02 c02 = new Child02();
		print(c02);
//		c02.print();
		
		Parent p = new Parent();
		print(p);
//		p.print();
		
	}
}