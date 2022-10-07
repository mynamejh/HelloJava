package co.edu.collect;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ListExample {
	public static void main(String[] args) {
		ArrayList<String> strs = new ArrayList<String>(); // 추가
		strs.add("홍길동");
		strs.add("김민식");
		strs.add("박유식");
		
		
		strs.remove(0);
		strs.remove("박유식");
		strs.add(0,"최기분");
		System.out.println("Collect크기: "+ strs.size()); //strs.size() -> 몇개있는지
		System.out.println(strs);

		for(String str : strs) {//strs가 갖고 있는 것만큼 반복해서 str에 저장
			System.out.println(str);
		}
		for(int i=0; i<strs.size(); i++) { //문자열은 %s 줄바꿈 \n
			System.out.printf("%d번째의 값은 %s\n", i, strs.get(i));
		}
		//반복자를 생성
		Iterator<String> itr=strs.iterator();
		while(itr.hasNext());{ 
			String result = itr.next(); // true면 값을 result 에담겠다
			System.out.println(result);
		}
		
		//100만건.
		ArrayList<Integer> inAry = new ArrayList<Integer>();
		long start = System.nanoTime();
		for(int i=0; i<1000000; i++) {
			inAry.add(i);
		}
		long end = System.nanoTime();
		System.out.println("ary: "+ (end-start));
		
		
		LinkedList<Integer> lnAry = new LinkedList<Integer>();
		start = System.nanoTime();
		for(int i= 0; i<1000000;i++) {
			lnAry.add(i);
		}
		end = System.nanoTime();
		System.out.println("lna: "+ (end-start));
	
	}
}
