package co.edu.emp.list;

import java.util.Calendar;
// 날짜정보 알 수 있음 (사용한 클래스 CalendarApp/MethodCalendar)
public class CalendarExe {
	public static void main(String[] args) {
	Calendar today = Calendar.getInstance(); // 싱글턴 방식
	today.set(2020, 1, 1); //.set(날짜지정)2022년 10월 1일 => 7 나옴 : 토요일이라서 (일욜이 1로 체크)
	System.out.println("요일 정보: "+ today.get(Calendar.DAY_OF_WEEK));
	System.out.println("날짜 정보: "+ today.get(Calendar.DATE));
	System.out.println("월 정보: "+ (today.get(Calendar.MONTH)+1)); // 0 : 1월
	System.out.println("월말 정보: "+ today.getActualMaximum(Calendar.DATE));
	}
}
