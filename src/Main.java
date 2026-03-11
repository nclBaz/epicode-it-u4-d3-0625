import entities.Circle;
import entities.Colore;

public class Main {
	public static void main(String[] args) {

		Circle circle1 = new Circle(); // III COSTRUTTORE
		Circle circle2 = new Circle(5.3); // II COSTRUTTORE
		Circle circle3 = new Circle(0.2, 2.3, 10, Colore.VERDE); // I COSTRUTTORE
		Circle circle4 = new Circle(20); // II COSTRUTTORE
		Circle circle5 = new Circle(20);

//		System.out.println("Cerchio 1");
		circle1.printInfo();
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

		System.out.println("Il numero di cerchi creati è : " + Circle.numCerchiCreati);

//		multiply(2, 3); // Se il metodo è statico non serve creare alcun oggetto per utilizzarlo
//
//		double x = 4;
//		double result = Math.sqrt(x); // Math è costituita solo ed esclusivamente da metodi e attributi statici, quindi per utilizzare le sue funzionalità
		// non c'è bisogno di creare oggetti ma li chiamerò direttamente facendo Math.PI, Math.sqrt()

		// Se non faccio la sovrascrittura di equals nella classe Circle
		// .equals() mi compara le 2 celle di memoria quindi considera
		// circle4 diverso da circle5
		if (circle4.equals(circle5)) System.out.println("SONO UGUALI");
		else System.out.println("SONO DIVERSI");

		System.out.println(circle5);

	}

	public static double multiply(double num1, double num2) {
		return num1 * num2;
	}
}
