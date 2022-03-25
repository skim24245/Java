package kr.ac.kopo.day11;

import java.util.Random;

class A {
	private Object data;
	
	A(Object data) {
		this.data = data;
	}
	
	Object getData() {
		return data;
	}
	
	void setData(Object data) {
		this.data = data;
	}
}

class B<T> { //generic 
	private T data;
	
	B(T data) {
		this.data = data;
	}
	
	T getData() { 
		return data;
	}
	
	void setData(T data) {
		this.data = data;
	}
}

public class GenericMain {

	public static void main(String[] args) {
		
		B<String> b = new B<String>(new String("hello"));
		System.out.println("길이 : " + b.getData().length());
		
		B<Random> b2 = new B<Random>(new Random());
		System.out.println("추출된 정수 : " + b2.getData().nextInt(10) + 1);
		
		B<String> b3 = new B<String>("byebye");
		b3.setData("aa");
		
		A a = new A(new String("hello"));
		String data = (String)a.getData();
		System.out.println("길이 : " + data.length());
		
		A a2 = new A(new Random());
		int random = ((Random)a2.getData()).nextInt(10) + 1;
		System.out.println("추출된 정수 : " +  random);
	}
}




