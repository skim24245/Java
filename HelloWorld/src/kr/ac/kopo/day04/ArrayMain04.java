package kr.ac.kopo.day04;

public class ArrayMain04 {

		public static void main(String[] args) {
			
//			int[] arr = {10, 20, 30, 40, 50};
			int[] arr = new int[] {10, 20, 30, 40, 50}; //이 방법을 많이 쓰긴 함. 
			
			arr = {5 ,4, 3}; 
			arr = new int[]{5, 4, 3}; //이미 만들어진 위의 {10,20,30,40,50}까지의 배열에 다른 초기값을 가진 배열을 선언하고 싶으면 new라는 것을 써야 함.
			
			System.out.println("arr : " + Arrays.toString(arr));
			
		}
	}

}
