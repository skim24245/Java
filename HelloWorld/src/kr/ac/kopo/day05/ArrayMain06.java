package kr.ac.kopo.day05;

public class ArrayMain06 {
	//참조자료형의 1차원을 더 많이 씀 
	public static void main(String[]args) {
   //변수를 모아놓은 집합 
   //같은 타입의 배열을 모아놓은 것 = 1차원 배열
   //1차원 배열들을 모아놓은 집합 = 2차원 배열 
   //2차원 배열들을 모아놓은 집합 = 3차원 배열  
		int[][] a  = new int[3][4]; //1차원 배열을 총 3개 저장하는 2차원 배열을 만들고 싶다는 뜻 // 3개의 숫자를 4개씩 가지고 있다는 뜻. //a변수 //여기서 [4]는 1차원 배열이 4개를 가지고 있다는 뜻. //a의 length는 3임. a가 가리키고 있는 배열의 길이를 말하는 것.
		//arr []의 length는 3이고 arr [] []의length는 4임. arr[]는 주소를 말하는 것이고 arr[]length는 arr[]이 들어있는 주소의 길이를 말함. 배열 주소는 heap에 저장됨 (new를 쓰기 때문)
		int[] b = new int[4]; //b 변수
		int[] c = new int[4]; //c 변수
		int [][] ar = {a, b,c}; //1차원 배열인 a b c 의 집합. 
		}
	/*/1차원의 집합이니까 1차원들의 주소값을 알면 됌. abc가 가지고 있는 값을 기억하기 위한 공간으로 0x40 , 0x60, 0x90 (주소값)의 배열을 알아야 함. 1차의 주소값을 가지고 있는 배열 = 2차원 배열 
		
    //생성은 new 키워드로 만든다 
		system.out.println(" arr : " + arr + ", arr.length : " + arr.length);
		System.out.println("arr : " + arr 
				+ ", arr.length : " + arr.length);
	
		for(int i = 0; i < arr.length; i++) {
		System.out.println("arr[" +i + "] : " + arr[i]);
	}
		/*/
		 int[]arr = arr[i] // 풀이: arr라는 변수를 선언하고 arr이 가지고 있는 주소값을 넣어준 것임. 
		 arr[][2] =arr이 //가리키고 있는 주소값에서부터 2가 떨어진 곳. 1차 주소 접근 -> 2차 주소로 접근 하는것. //
		/*
		 
		 * int []ar01 = new int[4];
		 * int []ar02 = new int[4];
		 * int []ar03 = new int[4];
		 *  -> int[][]arr = new int [3][4]; //실제 heap 영역에 만들어진 값은 4개임.
		 *  int [][]arr = {ar01, ar02, ar03};
		 *
		 *arr[0]이라는 뜻은 arr가 가리키고 있는 주소값에서 같은 타입의 변수가 0 떨어진 곳 
		 *arr[0]이라는 뜻은 arr가 가리키고 있는 주소값에서 같은 타입의 변수가 1 떨어진 곳
		 ** 
		 * 
		 */
	
	    /*
	    1차원 배열에다가 10 20 30을 대입하고 싶다면
	    for(int i = 0; i< arr[0].length; i++) {
	    	arr[0][i] = (i+1) *10;
	    /*
        
        /*
         for (int i =0; i <arr[0].length ; i++){
         arr[0][i] = (i+1) *10;
         }
         for(int i =0; i <arr.length ; i++){
         	for(int j = 0; j < arr[i].length; j++){
         system.out.println(
         }
         system.out.println(arr[i][j] + "\t");
         
         */
		 int[][] ar = new int[3][4];
		 int [] ar01 = new int[4];
		 int [] ar02 = new int[4];
		 int[][] ar = new int[3][];
		 for(int i =0; i <ar.length; i++) {
			 ar[i] = new int[(int)(Math.random()*3+]
			 ar[i] = new int[3+i];
			 
		 }
		 for(int i = 0; i <ar.length; i++) {
			 for(int j =0; j < ar[i].length; j++) {
				ar[i][j] = i*10 + (j+1);
			 }
			 System.out.println("ar[%d][%d]");
			 
		 }
         
         for(int[] arr : ar){
         	System.out.println(arr);
         	
         for(int[] arr : ar) {
        	 System.out.println(Arrays.tostring(Arr));
        
        /*
         * for(int []arr: ar){
         *  	for(int num : arr){
         *  		System.out.print(num + " ");
         *  }
         *  system.out.println();
         *  
         *  for(int i = 0; i< ar.length; i++){
         *  	for(int num : ar[i]){
         *  		system.out.print(num + " ");
         *  }
         *  system.out.println();
         *  
        	  */
         }