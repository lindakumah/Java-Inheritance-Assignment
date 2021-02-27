package javaInheritance;

class Rectangle2{
	int length;
	int breadth;
	
	Rectangle2(int length, int breadth){
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

class Square2 extends Rectangle2{
	int side;
	
	Square2(int s){
		super(s,s);
	}
	
}

public class Q4 {

	public static void main(String[] args) {

        Square2[] array = new Square2[10];
        int num = 5;
        for(int i=0; i<10; i++) {
        	array[i] = new Square2(num);
        	num++;
        }
	
        for (int i=0; i<10;i++) {
        	array[i].area();
        }
	
	}

}
