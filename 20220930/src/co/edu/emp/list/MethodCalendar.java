package co.edu.emp.list;

import java.util.Calendar;

public class MethodCalendar { //#달력 만들기//
	private static MethodCalendar instance = new MethodCalendar();
	private MethodCalendar() {};

	public static MethodCalendar getInstance() {
		return instance;
	}
	public void makeCal(int year,int month) {
		System.out.println("     >>>>  " + month +  "월  <<<<");
		String[] days = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri","Sat" };
	//#요일 출력
		for(String day : days) {
		System.out.printf("%4s",day);
		}
		System.out.println();
	// 1일의 위치를 지정	
		for (int i=0; i<getFirstDay(int year, int month); i++) {
			System.out.printf("%4s"," ");
		}
	//#날짜 출력	
	for(int i=1; i<=getLastDate(int year,int month); i++) {
		System.out.printf("%4d",i);
		if ((i+getFirstDay(9)) % 7 == 0 ){
			System.out.println();
			}
		}
	}	// end of makeCal()
	
	public int getFirstDay(int month, int month2) { //첫번째요일에 요일정보를 리턴
	Calendar cal = Calendar.getInstance();//시스템의 현재 날짜와 시간 관련 정보가 저장된 Calendar 인스턴스를 반환받아 저장
	cal.set(2022,month-1,1);
	return cal.get(Calendar.DAY_OF_WEEK)-1;// 
	} // end of getfitstDay
	
	public int getLastDate(int month, int year) {
	Calendar cal = Calendar.getInstance();
	cal.set(year, month -1,1);
	return cal.getActualMaximum(Calendar.DATE);
	}



	
} //end of class.