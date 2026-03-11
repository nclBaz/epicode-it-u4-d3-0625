package entities;

public class Circle {
	// LISTA ATTRIBUTI
	public double radius;
	public double x;
	public double y;

	// LISTA COSTRUTTORI
	public Circle(double coordX, double coordY, double raggio) { // I COSTRUTTORE <-- Circle c1 = new Circle(1.0, 0.5, 10.3);
		x = coordX;
		y = coordY;
		radius = raggio;
	}

	public Circle(double raggio) { // II COSTRUTTORE <-- Circle c2 = new Circle(10.1);
		radius = raggio;
		x = 0.0;
		y = 0.0;
	}

	public Circle() { // III COSTRUTTORE <-- Circle c3 = new Circle();
		radius = 1.0;
		x = 0.0;
		y = 0.0;
	}

	// LISTA METODI
	public double getDiameter() {
		return radius * 2;
	}

	public double getArea() {
		return radius * radius * Math.PI;
	}

	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}

	public void printInfo() {
		System.out.println("(X,Y) " + x + " " + y);
		System.out.println("Radius: " + radius);
		System.out.println("L'area è: " + getArea());
		System.out.println("Il perimetro è: " + getPerimeter());
	}

}
