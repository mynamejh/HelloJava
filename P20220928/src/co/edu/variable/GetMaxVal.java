package co.edu.variable;

public class GetMaxVal {
	public static void main(String[] args) {
		int[] randomAry = new int[5];
		randomAry[0] = (int) (Math.random() * 100)+1;// 0~1 사이에 임의수 생성.
		randomAry[1] = (int) (Math.random() * 100)+1;
		randomAry[2] = (int) (Math.random() * 100)+1;
		randomAry[3] = (int) (Math.random() * 100)+1;
		randomAry[4] = (int) (Math.random() * 100)+1;
		
//		int maxVal=0; // 배열 요소 중 가장 큰 값을 저장해라
		int minVal= 100; // 배열 요소 중 가장 작은값을 저장 
		for(int i=0; i<5; i++) {
			System.out.println(randomAry[i]);
			//maxVal 변수에 두 값을 비교해서 큰 값을 담기
			if(randomAry[i]<minVal) {
				minVal = randomAry[i];
			}
		}
		System.out.println("생성된 배열의 임의의 값중 최소값=>" +minVal);
	}
}
