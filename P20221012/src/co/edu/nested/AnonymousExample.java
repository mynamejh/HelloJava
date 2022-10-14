package co.edu.nested;

class People {
	int height;
	int weight;

	@Override
	void showInfo() {
		System.out.println("익명 showInfo");
		showColor();	
		}

	void showColor() {
		System.out.println(this.color);
	};

	peopleInfo(){
		
}
class Student extends People {
	int studNo;
}

//#익명 구현 클래스
public class AnonymousExample {
	public static void main(String[] args) {

		// # 익명 상속 클래스
		People people = new People();
		{

			String color;

		}

	};
	
	}
}

