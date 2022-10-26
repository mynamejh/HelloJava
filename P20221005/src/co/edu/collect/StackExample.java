package co.edu.collect;

import java.util.Stack;

class Coin {
	private int val;

	public Coin(int val) {
		this.val= val;
	}

public int getVal(){
	return val;
	}
}

public class StackExample {
	public static void main(String[] args) {
		Stack<Coin> coinBox=new Stack<>();
		//추가할때는 push 메소드 입력
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(60));
		
			//!. isEmpty => 값이있으면 true! 비어있는지확인
		while(!coinBox.isEmpty()) {
			Coin coin=coinBox.pop(); // 마지막 인스턴스부터 
			System.out.println(coin.getVal());
		}
	}
}
