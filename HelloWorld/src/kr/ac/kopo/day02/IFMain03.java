package kr.ac.kopo.day02;

public class IFMain03 {

	/*6개의 조건식을 분리하기 위해서는 5개의 조건이 필요하다. n-1이 필요함
	 * if(조건1) {
	 * 문장1;
	 * }else {
	 * if(조건2){
	 * 문장2;
	 * }else {
	 * if(조건3) {
	 * 문장3;
	 * }else {
	 * if(조건4){
	 * 문장4;
	 * }else {
	 * if(조건5){
	 * 문장5;
	 * }else {
	 * 문장6;
	 * }
	 * }
	 * 
	 * 
	 */
	if (time < 800) { // 집에서 출발한 시간이 8시 이후인 중에서 15분 이전에 있는 것
		System.out.println("걸어서 학교에 간다");
	} else if(time < 815) { //8시 이후부터 8시 15분 사이 
			System.out.println("버스를 타고 학교에 간다");
	} else { //8시 이후이거나 8시 15분 이후  //else 뒤에는 ; 붙이는 거 아니다!! 세미콜론은 실행하려는 단위일 때 쓰는 것이다. 
			System.out.println("택시를 타고 학교에 간다");
	} // ctrl shift f :단축키 

	
	
	/*
	  중첩된 if를 다중 if로 만들 수 있고 다중 if를 중첩된 if로 만들 수 있음.
	  조건 1도 거짓이고 조건 2도 거짓이면 조건 3을 실행...
	   if(조건1) {
	 * 문장1;
	 * } (조건2){
	 * 문장2;
	 * }else if {
	 * if(조건3) {
	 * 문장3;
	 * }else if{
	 * if(조건4){
	 * 문장4;
	 * }else if{
	 * if(조건5){
	 * 문장5;
	 * }else if{
	 * 문장6;
	 */

