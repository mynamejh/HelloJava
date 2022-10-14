package test_1014;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChartStream {

	List<Member> memList = new ArrayList<>();
	File file = new File("c:/Temp/memList.dat");
	Scanner scn = new Scanner(System.in);	

	private static ChartStream instance = new ChartStream();
	
	private ChartStream () {
		
	}
	
	
}
