package co.edu.crud;


import co.edu.board.BoardDAO;


public class crudExe {
	public static void main(String[] args) {
		crudDAO crud=crudDAO.getInstance();
		crud.exe();
	}
}
