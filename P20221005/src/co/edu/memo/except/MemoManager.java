package co.edu.memo.except;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import co.edu.memo.Memo;

public class MemoManager {

	List<Memo> memoStorage = new ArrayList<>(); // 정보 담아놓기 위한 컬렉션
	File file = new File("C:/Temp/memobook.dat"); // 파일만든다
	Scanner scn = new Scanner(System.in);
	
	//싱글톤 방식으로 만들기
	private static MemoManager instance = new MemoManager();
	
	private MemoManager() {
		readFromFile();
	}
	
	public static MemoManager getInstance() {
		return instance;
	}
	
	//추가기능
	public void inputData() {
		System.out.print("번호 입력>> ");
		int no = Integer.parseInt(scn.nextLine());
		System.out.println("날짜 입력>> ");
		String date = scn.nextLine();
		System.out.println("내용 입력>> ");
		String content = scn.nextLine();
		
		memoStorage.add(new Memo(no,date,content));
		
	}
	
	
	//조회기능 (날짜 입력 받으면 해당되는 메모 출력)
	public void searchData() {
		System.out.println("날짜 입력>> ");
		String sDate = scn.nextLine(); // 입력 날짜 저장
		boolean exists = false;
	
		for(int i=0; i<memoStorage.size(); i++) { // 날짜를 입력받아서 
			if(sDate.equals(memoStorage.get(i).getDate())) {
				System.out.println(memoStorage.get(i).toString());
				exists = true;
			}
		}
		// 해당 값이 없다면~ (exists 가 false)
		if(!exists) {
			System.out.println("해당 날짜의 메모가 없습니다.");
		}
	}
	
	//삭제 기능(번호를 입력해주면 한건 삭제)
	public void deleteDate() {
		System.out.println("삭제할 번호?");
		int delNO=Integer.parseInt(scn.nextLine());
		
		for(int i=0; i<memoStorage.size();i++) {
			if(delNO==memoStorage.get(i).getNO()) {
				memoStorage.remove(i);
				System.out.println("삭제완료");
			}else {
			System.out.println("해당 번호가 없습니다");
			}
		}
	}
	
	// 파일을 읽어서 데이터 memoStorage 기능
	public void readFromFile() {
	
		//try with resource.
		try(FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			){
		
			
			//값이 있으면 memoStorage 에 담고 없으면 놔둬라
			memoStorage= (List<Memo>) ois.readObject();
			
		}catch(Exception e) {
//			e.printStackTrace();
			return;
		}
	}
	
	//종료하면 파일 저장
	public void storeTOFile() {
		try(FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			){
			
			oos.writeObject(memoStorage); //파일 저장
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
