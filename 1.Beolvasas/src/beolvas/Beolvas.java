package beolvas;

import java.util.Scanner;

public class Beolvas {

	public static void main(String[] args) {
		Scanner beolvas = new Scanner(System.in);
		 
		System.out.print("Kerem a nevet: ");
		String read = beolvas.next();
		
		beolvas.close();
		System.out.println("A beolvasott nev: " + read);
	}
}