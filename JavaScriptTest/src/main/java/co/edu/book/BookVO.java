package co.edu.book;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookVO {
	String bookCode;
	String title;
	String writer;
	String press;
	int price;
	}


