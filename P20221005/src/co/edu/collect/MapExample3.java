package co.edu.collect;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//
//class Student{
//	String name;
//	String classNumber;
//	
//	public Student(String name, String classNumber) {
//		this.name= name;
//		this.classNumber = classNumber;
//		
//		
//	}
//
//	@Override
//	public int hashCode() {
//		return name.hashCode();
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof Student) {
//			Student target = (Student) obj;
//			return this.classNumber.equals(target.classNumber);
//		}else {
//			return false;
//		}
//	}
//	
//	
//}

public class MapExample3 {
	public static void main(String[] args) {
		// 1.저장 2.조회 3.종료
		Map<String, Integer> students = new HashMap<>();
		
	
		Scanner scn= new Scanner(System.in);
		
		while(true) {
			System.out.println("1.저장 2 조회 3 종료");
			System.out.println("선택>>  ");
			
			int menu = scn.nextInt();

			if(menu==1) {
				System.out.print("학생이름입력>>  ");
				String name= scn.nextLine();
				System.out.print("학생점수입력>>  ");
				int score = scn.nextInt();
				students.put(name, score);
				
			
			}else if(menu==2){
				System.out.println("조회할 학생이름 입력>>  ");
				String searchName= scn.nextLine();
				System.out.println("점수: " + students.get(searchName));
				
			}else if(menu==3){
				System.out.println("프로그램이 종료했습니다");
				break;
			}
		}
	}
}
