package co.edu.board;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
<<<<<<< HEAD
@AllArgsConstructor //각각의 필드를 업그레이드 시켜줌
@NoArgsConstructor
public class BoardVO {
	private int boardNo;
	private String title;
	private String content;
	private String writer;
	private String writeDate; //굳이 date로 안해도 된다.
	private int clickCnt;
	private String image;
	

	
	
=======
@AllArgsConstructor //생성자 만들어주는
@NoArgsConstructor //매개값이 없는 생성자 만들어주는
public class BoardVO {
	private int boardNo;
	private String title;
	private String content;
	private String writer;
	private String writeDate; //2020-11-23
	private int clickCnt;
	private String image;
>>>>>>> branch 'master' of https://github.com/mynamejh/HelloJava.git
}
