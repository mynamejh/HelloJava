package co.edu.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class EmpObjectExam { // 예외로 던져버리겠다
	public static void main(String[] args) throws Exception {
	
		//C:/Temp/emp.dat
		FileInputStream fis = new FileInputStream("C:/Temp/emp.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ArrayList<Emp> empList = (ArrayList<Emp>)ois.readObject();
		
		Scanner scn= new Scanner(System.in);	
		
		while(true) {
			System.out.println("1.사원등록 2.목록출력 3.삭제 4.종료");
			System.out.println("선택>> ");
			
			int menu = scn.nextInt();
			scn.nextLine();
			String[] empAry;
			
			if(menu==1) {
				System.out.println(">> ");
				String empVal = scn.nextLine();
//				int idx=0;
//				while(scn.hasNext()) {
//					empAry[idx++] = scn.next();
//				}
				//split을 이용할 경우
				empAry = empVal.split(" ");		
				Emp emp = new Emp(Integer.parseInt(empAry[0]), empAry[1], empAry[2]);
				empList.add(emp);
				System.out.println("입력완료");
			
			}else if(menu==2) {
				for(Emp emp : empList) {
					System.out.println(emp.toString());
				}
			}else if(menu==3) {
				//사원번호를 기준으로 삭제
				System.out.println("삭제할 사원 번호를 입력하세요>> ");
				int empNum = scn.nextInt();
				if(empNum==empList.remove(id)) {
					
				}else{
					System.out.println("잘못입력했습니다");
				}
						
				
				
			}else if(menu==4) {
				//컬렉션이 담겨져있던 ObjectOutputStream을 활용해서
				//C:/Temp/emp.dat 저장하고 종료하기
				
				FileOutputStream fos = new FileOutputStream("C:/Temp/emp.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(empList);
				oos.close();
				
				break;
			}else {
				System.out.println("잘못된 메뉴를 선택했습니다!");

			}
		}
	}
}
