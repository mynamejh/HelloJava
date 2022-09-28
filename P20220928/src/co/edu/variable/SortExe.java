package co.edu.variable;

public class SortExe {
	public static void main(String[] args) {
		int[] numAry = {34, 21, 12};
		
		//반복적인 처리.
//		numAry = {12,21,34} 작은값 순으로 위치를 바꾸는 방법?
		
		if(numAry[0]> numAry[1]) { //34>21 비교
			int temp = numAry[0];
			numAry[0] = numAry[1]; // 21 담음
			numAry[1] = temp; // 뭐지...
		}
		for (int n: numAry) {
			System.out.println(n);
		}
	}
}