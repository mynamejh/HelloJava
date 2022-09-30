package co.edu.crud;

import co.edu.board.BoardDAO;

public class crudExe {
	public static void main(String[] args) {
		crudDAO crud=BoardDAO.getInstance();
		crud.exe();
	}
}
