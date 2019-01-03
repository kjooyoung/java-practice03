package ptob6.refactoring;

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
			String operator = tokens[1];
			int a = Integer.parseInt(tokens[0]);
			int b = Integer.parseInt(tokens[2]);
			
			Arith arith = null;
			switch (operator) {
			case "+":
//				Add add = new Add();
//				add.setValue(num1, num2);
//				System.out.println(">> "+add.calculate());
				arith = new Add();
				break;
			case "-":
				arith = new Sub();
				break;
			case "*":
				arith = new Mul();
				break;
			case "/":
				arith = new Div();
				break;
			}
			
			if(arith == null) {
				System.out.println(">> 알수없는 연산입니다.");
				continue;
			}
			
			arith.setValue(a,b);
			System.out.println(">> "+arith.calculate());
		}
	}
}
