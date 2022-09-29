package co.edu.variable;

public class SortExe {
	public static void main(String[] args) {
		int[] numAry = {34, 21, 12, 25, 58};// 12,21,34 로 오게하기
		
		for(int j = 0; j<numAry.length -1; j++) {
		for(int i=0; i<numAry.length-1 ; i++) {
			if(numAry[i]>numAry[i+1]) { // i 값: 0 ,i 값:1
			int temp = 0;
			temp = numAry[i]; // 순서가 먼저 있는 값을 temp에 저장
					numAry[i] = numAry[i+1];
					numAry[i+1] = temp;
			}
		}

		//순서 출력
		for (int n: numAry) {
			System.out.println(n + " ");
		}
	}
 }
}		
		
		
		
		
		//반복적인 처리가 필요함
//		numAry = {12,21,34} 작은값 순으로 위치를 바꾸는 방법?
//		케이스 n1>n2>n3 경우에 
//		케이스 n1<n2>n3 경우 위치 바꾸는 방법? (케이스 생각해오기..)
		
//		1) 4개 -> 3번 비교, 2번 비교, 1번 비교
		
//		if(numAry[0]> numAry[1]) { //34>21 비교
//			int temp = numAry[0];
//			numAry[0] = numAry[1]; // 21 담음
//			numAry[1] = temp; // 뭐지...
//		}
//		if(numAry[1]> numAry[2]) {//34>21
//			int temp = numAry[1];
//			numAry[1]=numAry[2];
//			numAry[2]= temp;
//		}
//		if(numAry[0]> numAry[1]) {//34 >21
//			int temp = numAry[0];
//			numAry[0]=numAry[1]; //21
//			numAry[1]= temp;
//		}
//		
