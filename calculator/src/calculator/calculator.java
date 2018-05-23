package calculator;

import java.util.Scanner;

public class calculator {
	
	public static void main (String[] args) {
		
		int number1 = 0;
		int number2 = 0;
		int res = 0;
		String op = "";
		Scanner sc = new Scanner(System.in);
		
		String array[] = new String[10];
		
		System.out.println("Kerem a muveletet!");
		array = sc.nextLine().split(" ");
		
		number1 = Integer.parseInt(array[0]);
		op = array[1];
		number2 = Integer.parseInt(array[2]);
		
		
		sc.close();
		
		
		
		/*System.out.println("Kerem az elso szamot!");
		number1 = sc.nextInt();
		
		System.out.println("Kerem az operandust!");
		op = sc.next();
		
		System.out.println("Kerem a masodik szamot!");
		number2 = sc.nextInt();
		sc.close();*/
		
		// System.out.println(number1 + " " + op + " " + number2 );
		
		switch (op) {
		
				case "+": res = number1 + number2 ;
					break;
				
				case "-": res = number1 - number2 ;
					break;
		
				case "*": res = number1 * number2 ;
					break;
		
				case "/": 
					
					if(number2 != 0)
						System.out.println("0-val nem lehet osztani!");
					else
						res = number1 / number2;
					
					res = number1 / number2 ;
					break;
		}
	
		System.out.println("Az eredmeny: " + res);
		
	} 

}

