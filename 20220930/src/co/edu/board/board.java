package co.edu.board;

public class board {
	
		private int boardNo;
		private String title;
		private String content;
		
		public board() {
		} //매개변수가 없는 기본생성자
		
		public board(int boardNo, String title, String content) {
			super();
			this.boardNo = boardNo;
			this.title = title;
			this.content = content;
		}
		public int getBoardNo() {
			return boardNo;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getContent() {
			return content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public void setBoardNo(int boardNo) {
			this.boardNo = boardNo;
		}
		
		public void setContetnt(String content) {
			this.content = content;
		}
		
		@Override
		public String toString() {
			return "board [boardNo=" + boardNo + ", title=" + title + ", content=" + content + "]";
		}



}


