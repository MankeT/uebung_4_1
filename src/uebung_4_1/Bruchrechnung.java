package uebung_4_1;

public class Bruchrechnung {
	
public static void bruchDarstellen (int zaehler, int nenner ) {
		
		double a = zaehler;
		double b = nenner;
		double bruch = a/b;
		
		
		
		System.out.println(zaehler);
		System.out.println("- = " + bruch);
		System.out.println(nenner);
		System.out.println();

	}
	
	public static void main(String[] args){
		int zaehler = 20;
		int nenner = 4;
		
		int a = 120;
		int b = 4;
		
		int c = 50;
		int d = 4;
	
		bruchDarstellen(zaehler, nenner);
		bruchDarstellen(a, b);
		bruchDarstellen(c, d);
		
	}
}
