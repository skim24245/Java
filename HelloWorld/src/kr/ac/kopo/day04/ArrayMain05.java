package kr.ac.kopo.day04;

import java.util.Arrays;

public class ArrayMain05 {
	public static void main(String[]args) {
		int [] arr = {10, 20, 50, 70, 30};
		int [] copy = arr; 
		//deep copy (깊은 복사)
		int [] copy = new int[arr.length];
		System.arraycopy(arr, 0, copy, arr.length); //굳이 for문을 안쓰고 array copy라는 메소드를 쓸 수 있음. math나 system나 string class는 import를 안쓰고 함. 자바.lang.class 에 자동으로 import 모든 클래스를 다 가지고 오기 때문에 import를 하지 않고 사용한다. 
		//pacakage . java. lang 패키지는 import를 안쓰고 해도 됌. 자바 문서 들어가서 java lang 패키지 알아보자. 
		
		
		/* 값을 복사하고 싶으면 우선 공간을 만들고 그 뒤에 복사하는 것임. 
		 * copy의 배열이 가지고 있는 값이 arr를 가지고 있다고 하면 // copy는 arr의 값을 가진다는 뜻 . 배열은 1개인데 arr라는 값과 copy라는 값이 참조변수가 됌. 2개를 가리키는 것. 
		   참조변수를 복사해서 하나의 배열을 2개의 참조변수가 가리키도록 바꿈. 이게 shallow copy라고 함. 복사를 하긴 했는데 실제 배열 값이 아닌 주고값을 복사함. 하나의 공간을 2개의 참조 변수값이 같이 
		  우리는 arr가 가리키고 있는 공간을 복사하고 싶은데   -> 여기서는 주소값만 복사가 됌 -> shallow copy라고 함 //array가 가리키고 있는 주소값과 copy가 가리키고 있는 주소값이 같다 보니 값이 같게 나옴. @ ~~~~~형태가 똑같이 2번 나옴.
			우리는 10부터 30까지 실제 공간이 복사되는 것을 원함.
			따라서 참조변수가 가리키고 있는 내용 안에 있는 전체 값까지 함께 복사하고 싶다면 new라는 것을 써서 원본값이 그대로 복사가 됌  -> deep copy
			int [] copy= new int[arr.legnth] //array에 length만큼 복사를 한다는 뜻임. 
			for(int i = 0; i < arr.length; i++){
			copy[i] = arr[i]
			
		 * 
		 */
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("copy : " + Arrays.toString(copy));
		copy [2] = 100; //copy의 2번지에 있는 값을 100으로 수정함
		System.out.println("arr : " + Arrays.toString(arr));
		System.out.println("copy : " + Arrays.toString(copy)); //copy가 가진 원소값만을 수정하고 싶은데 arr이 가진원소값까지 같이 수정됌 
		
	}
	}
}
