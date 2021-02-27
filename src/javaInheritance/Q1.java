package javaInheritance;

class parentclass{
	void mom() {
		System.out.println("This is parent class");
	}
}

class childclass extends parentclass{
	void daughter() {
		System.out.println("This is child class");
	}
}

public class Q1 {

	public static void main(String[] args) {
	    
		parentclass m = new parentclass();
		childclass d = new childclass();
		
		m.mom();
		d.daughter();
		d.mom();

	}

}
