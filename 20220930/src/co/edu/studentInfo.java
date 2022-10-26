package co.edu;

public class studentInfo {
public static void main(String[] args) {

	Student stud1 = new Student();
	stud1.setStudNo("12345");
	stud1.getName ("김민지");
	stud1.study("");
	
	
	Student stud2 = new Student();
	stud2.getStudNo("3455");
	stud2.getName ("김은지");
	stud2.study("");

	Student stud3 = new Student();

	
	Student[] students;
	students = new Student[] {stud1, stud2, stud3};
	for(Student stud : students) {
		System.out.println("학번: "+ stud.getStudNo(null) + ",학생이름: ");
	}
}
}	

