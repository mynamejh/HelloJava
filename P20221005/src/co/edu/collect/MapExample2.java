package co.edu.collect;

import java.util.HashMap;
import java.util.Map;

class Book {
	String bookCode;
	String author;
	String publish;

	public Book(String bookCode, String author, String publish) {//생성자함수
		this.bookCode = bookCode;
		this.author = author;
		this.publish = publish;
	}
// hashCode, equals 메소드 동일한 값이면 
// 잘모를 p569
	@Override
	public int hashCode() {
		return bookCode.hashCode(); // string타입의 북코드를 해쉬코드를 가져오겠습니다
	}

	@Override
	public boolean equals(Object obj) { //obj 랑 북코드랑 타입이 맞아야 비교가능하며, 동일한 hash코드 리턴
		if(obj instanceof Book) {
				Book target = (Book) obj;
				return this.bookCode.equals(target.bookCode);
		}else {
			return false;
		}
	}
	
}

public class MapExample2 {
	public static void main(String[] args) {
		Map<Book,Integer> map = new HashMap<>();
		map.put(new Book("239208", "홍길동","순수출판사"), 2000); // -> 안에 인스턴스가 키 값이다!
		map.put(new Book("wewew8","김민수","좋은출판사"),3000);
		map.put(new Book("abcdef","홍성은","우리출판사"),4000);
		
		Integer val = map.get(new Book("239208", "홍길동","순수출판사"));
		System.out.println("값: " + val);
	}
}
