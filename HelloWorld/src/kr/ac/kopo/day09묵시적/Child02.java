package kr.ac.kopo.day09묵시적;

import kr.ac.kopo.day09.copy02.Parent;

public class Child02 extends Parent{
	String name = "자식2";
	
	public void print() {
		System.out.println("Child02::print() 호출...");
	}
	
	public void play() {
		System.out.println("나는 놉니다");
	}
	public void sing() {
		System.out.println("나는 노래를 부릅니다");
	}
}
