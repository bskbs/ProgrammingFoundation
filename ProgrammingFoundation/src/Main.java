import java.util.Scanner;

public class Main {

	public static float add(float a, float b) {
		return a + b;
	}

	public static float sub(float a, float b) {
		return a - b;
	}

	public static float mul(float a, float b) {
		return a * b;
	}

	public static float div(float a, float b) {
		return a / b;
	}

public static void main(String[] args) {
	System.out.println("Enter the option \n" 
			+ " 1.Add \n 2.sub \n 3.mul \n 4.div \n 5.exit");
	Scanner scanner = new Scanner(System.in);
	
	while(true) {
	int choice = scanner.nextInt();
		
	switch (choice) {
	case 1: {
		System.out.println("Addition");
		System.out.println("Etner two numbers to add: ");
		float number1 = scanner.nextFloat();
		float number2 = scanner.nextFloat();
		
		System.out.println(number1);
		System.out.println(number2);
		
		float result = add(number1, number2);
		System.out.println("Addition of" + number1 + number2 + "is" + result);
		
	}
		break;
	case 2: {
		System.out.println("Subtraction");
		System.out.println ("Enter two numbers to subtract: ");
		
		float number1 = scanner.nextFloat();
		float number2 = scanner.nextFloat();
		
		float result = sub(number1, number2);
		System.out.println(result);
		
		
			}
		break;
		
	case 3: {
		System.out.println("Multiplication");
		System.out.println ("Enter two numbers to subtract: ");
		
		float number1 = scanner.nextFloat();
		float number2 = scanner.nextFloat();
		
		float result = mul(number1, number2);
		System.out.println(result);
		
	}
		break;
	case 4: {
		System.out.println("Division");
		System.out.println("Enter two numbers to Divide: ");
		
		float number1 = scanner.nextFloat();
		float number2 = scanner.nextFloat();
		float result = div(number1, number2);
		
		System.out.println(result);
		
	}
	break;
	case 5: {
		System.out.println("5");
		System.exit(0);
		
	}
		break;
		default: {
			System.out.println("Default Case");
	}
	}
}
	}
}
