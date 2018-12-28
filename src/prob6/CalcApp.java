package prob6;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while( true ) {
			String[] s = new String[3];
			
			System.out.print( ">> " );
			String expression = scanner.nextLine();
			if(expression.equals("quit")) break;
			
			String[] tokens = expression.split(" ");
			String symbol = tokens[1];
			int num1 = Integer.parseInt(tokens[0]);
			int num2 = Integer.parseInt(tokens[2]);
			
			switch (symbol) {
			case "+":
				Add add = new Add();
				add.setValue(num1, num2);
				System.out.println(">> "+add.calculate());
				break;
			case "-":
				Sub sub = new Sub();
				sub.setValue(num1, num2);
				System.out.println(">> "+sub.calculate());
				break;
			case "*":
				Mul mul = new Mul();
				mul.setValue(num1, num2);
				System.out.println(">> "+mul.calculate());
				break;
			case "/":
				Div div = new Div();
				div.setValue(num1, num2);
				System.out.println(">> "+div.calculate());
				break;
			}
			
		}
	}
}
