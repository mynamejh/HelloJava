package co.edu.board;

import java.util.List;

import co.edu.common.DAO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberVO extends DAO {
	private String name;
	private String id;
	private String passwd;
	private String email;
	private String date;
	private String responsibility;
	

}
