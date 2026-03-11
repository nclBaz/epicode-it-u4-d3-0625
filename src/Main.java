import entities.Circle;

public class Main {
	public static void main(String[] args) {

		Circle circle1 = new Circle(); // III COSTRUTTORE
		Circle circle2 = new Circle(5.3); // II COSTRUTTORE
		Circle circle3 = new Circle(0.2, 2.3, 10); // I COSTRUTTORE
		Circle circle4 = new Circle(20); // II COSTRUTTORE

//		System.out.println("Cerchio 1");
//		circle1.printInfo();
//		System.out.println("Cerchio 2");
//		circle2.printInfo();
//		System.out.println("Cerchio 3");
//		circle3.printInfo();
//		System.out.println("Cerchio 4");
//		circle4.printInfo();

		System.out.println("L'area del cerchio 1 é:" + circle1.getArea());
		System.out.println("La coordinata X di cerchio 1 è: " + circle1.x);
		circle1.x = 1000;
		System.out.println("La coordinata X di cerchio 1 è: " + circle1.x);
	}
}
