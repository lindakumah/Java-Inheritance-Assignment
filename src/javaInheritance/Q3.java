package javaInheritance;

class Rectangle{
	int length;
	int breadth;
	
	Rectangle(int length, int breadth){
		this.length = length;
		this.breadth = breadth;
	}
	
	void area() {
		System.out.println(length*breadth);
	}
	
	void perimeter() {
		System.out.println(2*(length*breadth));
	}
	
}

class Square extends Rectangle{
	int side;
	
	Square(int s){
		super(s,s);
	}
	
}

public class Q3 {

	public static void main(String[] args) {
		
	    Rectangle rect = new Rectangle(4,6);
	    Square sqr = new Square(5);
	    
	    rect.area();
	    rect.perimeter();
	    sqr.area();
	    sqr.perimeter();
		

	}

}
