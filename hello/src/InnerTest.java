
public class InnerTest {
	public static void main(String[] args) {
		//1~5번까지 반복!	
		for(int i=1; i<=5; i++) {//5줄 -> 몇 줄 찍을까
			for(int j=1; j<=i; j++) {
				System.out.printf("*"); //가로로 10번 반복 찍힘 옆으로 몇칸 찍을까
			}
			System.out.println(); //줄바꿈
		}
		
	}
}
