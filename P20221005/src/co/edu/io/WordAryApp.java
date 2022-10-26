package co.edu.io;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class WordAryApp {
	public static void main(String[] args) throws Exception {
		// 임의 단어를 문장을 10개씩 출력하고 타이핑해서 맞으면 사라지고...
		Scanner scn = new Scanner(System.in);

		ArrayList<String> words = randomWords(10);
		for (String word : words) {
			System.out.println(word);
		}

		// 하나씩 찾아서 지우기_ 지워오기 숙제......답x...
		String inputVal = scn.nextLine();
		for(int i=0; i<words.size();i++) {
			if (words.get(i).equals(inputVal)) {
				words.remove(i);
			}break;
	}
		}
	// 예외가 발생하면 randomWords 호출한 곳으로 던지겠다~
	public static ArrayList<String> randomWords(int times) throws Exception {

		// ArrayList<String> 전체 문장을 담고
		ArrayList<String> words = new ArrayList<String>();
		String path = "src/co/edu/io/wordAry.txt";
		File file = new File(path);

		Scanner scn = new Scanner(file);

		while (scn.hasNext()) { // 읽어올게 있으면 읽어와라
			String readStr = scn.nextLine();
			readStr = readStr.replaceAll("\"", "").trim(); // 여백 자름: trim()
//			System.out.println(readStr);
			words.add(readStr.substring(0, readStr.indexOf(",")));
		}

		// 임의의 개수 (times) 갯수만큼을 반환하도록.
		ArrayList<String> randomWords = new ArrayList<String>();

		// --> 임의의 문장을 추출하라
		Set<Integer> idxSet = new HashSet<>();
		while (idxSet.size() < times) {
			idxSet.add((int) (Math.random() * words.size()));
		}
		for (int idx : idxSet) {
			randomWords.add(words.get(idx));
		}

		while (randomWords.size() < times) {
			randomWords.add(words.get((int) (Math.random() * 494)));
		}

		scn.close();
		return randomWords;
	}

}
