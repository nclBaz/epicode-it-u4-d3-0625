package entities;

public class Circle {
	// LISTA ATTRIBUTI
	public double radius;
	public double x;
	public double y;

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
