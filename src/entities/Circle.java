package entities;

public class Circle {
	public static int numCerchiCreati = 0;
	// LISTA ATTRIBUTI
	public double radius;
	public double x;
	public double y;
	public Colore colore; // o BLU o ROSSO o VERDE (no altri valori permessi)

	// LISTA COSTRUTTORI
	public Circle(double x, double y, double radius, Colore colore) { // I COSTRUTTORE <-- Circle c1 = new Circle(1.0, 0.5, 10.3);
		this.x = x; // this si riferisce all'OGGETTO CORRENTE. Quindi this.x è l'attributo x dell'oggetto, x è il parametro che stiamo passando
		this.y = y;
		this.radius = radius;
		this.colore = colore;
		Circle.numCerchiCreati++;
	}

	public Circle(double raggio) { // II COSTRUTTORE <-- Circle c2 = new Circle(10.1);
		this.radius = raggio;
		this.x = 0.0;
		this.y = 0.0;
		this.colore = Colore.VERDE;
		numCerchiCreati++;

	}

	public Circle() { // III COSTRUTTORE <-- Circle c3 = new Circle();
		this.radius = 1.0;
		this.x = 0.0;
		this.y = 0.0;
		this.colore = Colore.VERDE;
		numCerchiCreati++;
	}

	public void printInfo() {
		System.out.println(this.getClass().getSimpleName());
		System.out.println("(X,Y) " + this.x + " " + this.y);
		System.out.println("Radius: " + this.radius);
		System.out.println("L'area è: " + this.getArea());
		System.out.println("Il perimetro è: " + this.getPerimeter());
		System.out.println("Il colore è: " + this.colore);
	}

	// LISTA METODI
	public double getDiameter() {
		return this.radius * 2;
	}

	public double getArea() {
		return this.radius * this.radius * Math.PI;
	}

	public double getPerimeter() {
		return 2 * Math.PI * this.radius;
	}

	@Override
	public boolean equals(Object o) { // Con tasto dx -> generate -> equals and hashcode mi sovrascrive il comportamento di default di equals
		// il comportamento di default di equals è quello di comparare le 2 celle di memoria
		if (o == null || getClass() != o.getClass()) return false;
		Circle circle = (Circle) o;
		return Double.compare(radius, circle.radius) == 0 && Double.compare(x, circle.x) == 0 && Double.compare(y, circle.y) == 0;
	}

	@Override // Anche il metodo toString() quasi sempre è bene sovrascriverlo
	// perché il default non stampa le informazioni dell'oggetto
	// Tasto dx -> generate -> toString per sovrascriverlo
	public String toString() {
		return "{" +
				"radius=" + radius +
				", x=" + x +
				", y=" + y +
				", colore=" + colore +
				'}';
	}


}
