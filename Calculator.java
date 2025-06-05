package abc;

public class Calculator {
	int calculate(int a,int b) {
		return a+b;
	}
	double calculate(double a,double b) {
		return a*b;
	}
	int calculate(int a,int b,int c) {
		return a*b*c;
	}

	public static void main(String[] args) {
		Calculator c =new Calculator();
		System.out.println(c.calculate(12,30));
		System.out.println(c.calculate(12.3,2.3));
		System.out.println(c.calculate(10, 12, 2));
		

	}

}
