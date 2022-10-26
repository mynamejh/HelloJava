class MyPoint{
	int x;
	int y;
}


class Circle extends MyPoint{
	int r;
}

public class InTest {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.x = 1;
		c.y = 2;
		c.r = 3;
		System.out.println( c.x+c.y+c.r);
		
		
		
	}
}
