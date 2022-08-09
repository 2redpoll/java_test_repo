package ru.stqa.jtr.sandbox;

public class firstProgram {

	public static void main(String[] args) {	
		hello("world");
		hello("user");
		hello("Vlad");
		hello("suka, blyat");

		Square s = new Square(5);
		System.out.println("Square area with side " + s.l + " = " + s.area());

		Rectangle r = new Rectangle(4, 6);
		System.out.println("Rectangle area with sides " + r.a + " and " + r.b +  " = "  + r.area());

		Multiplie m = new Multiplie(7, 5);
		System.out.println(m.n1 + " multiplied by " + m.n2 + ", plus 10 = " + m.mult());
	}

	public static void hello(String somebody) {
		System.out.println("Hello, " + somebody + "!");
	}
}