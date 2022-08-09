package ru.stqa.jtr.sandbox;

public class firstProgram {

	public static void main(String[] args) {	
		hello("world");
		hello("user");
		hello("Vlad");

		Square s = new Square(5);
		System.out.println("Square area with side " + s.l + " = " + area(s));

		Rectangle r = new Rectangle(4, 6);
		System.out.println("Rectangle area with sides " + r.a + " and " + r.b +  " = "  + area(r));

		Multiplie m = new Multiplie(7, 5);
		System.out.println(m.n1 + " multiplied by " + m.n2 + ", plus 10 = " + mult(m));
	}

	public static void hello(String somebody) {
		System.out.println("Hello, " + somebody + "!");
	}

	public static double area(Square s) {
		return s.l * s.l;
	}

	public static double area(Rectangle r) {
		return r.a * r.b;
	}

	public static int mult(Multiplie m) {
		return  (m.n1 * m.n2) + 10;
	}
}