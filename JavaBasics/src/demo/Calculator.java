package demo;

public class Calculator {
	
	public void add(int a, int b){//a and b are called as formal parameters
		System.out.println(a+b);
	}
	
	public void subtract(int a, int b){
		System.out.println(a-b);
	}
	
	//Adding a comment in line number 13
	
	public void divide(int a, int b){
		System.out.println(a/b);
	}
	
	public void multiply(int a, int b){
		System.out.println(a*b);
	}
	
	public static void main(String[] args) {
		Calculator basicCal = new Calculator();		
		
		basicCal.add(10, 20);  //10 and 20 are called as actual Parameters
		basicCal.subtract(90, 20);
		basicCal.divide(100, 10);
		basicCal.multiply(16, 8);
		
		
	}

}
