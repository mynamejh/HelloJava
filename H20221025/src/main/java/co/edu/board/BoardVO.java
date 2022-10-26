package co.edu.board;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
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
	

	
	
}
