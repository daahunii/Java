import java.util.Scanner;
public class Temperature {
	private double degree;
	private char scale;
	public static void main(String[] args) {
		System.out.println();
		System.out.println("Test case 1: default constructor and");
		System.out.println("writeOutput() method.");
		System.out.println();
		Temperature t1 = new Temperature();
		System.out.println("Results of default constructor:");
		System.out.println("Verify 0 degrees C.");
		System.out.println();
		t1.writeOutput();
		System.out.println();
		System.out.println("==========================================");
		
		System.out.println("Test case 2: readInput() method.");
		t1.readInput();
		System.out.println();
		System.out.println("Verify temperature and units:");
		System.out.println("Should be whatever you just entered.");
		System.out.println();
		t1.writeOutput();
		System.out.println();
		System.out.println("==========================================");
		
		System.out.println("Test case 3: constructor with just temperature.");
		Temperature t2 = new Temperature(20.5);
		System.out.println();
		System.out.println("Verify 20.5 degrees C.");
		System.out.println();
		t2.writeOutput();
		System.out.println();
		System.out.println("==========================================");
		
		System.out.println();
		System.out.println("Test Case 27: is 0 degrees C = 32 degrees F?");
		System.out.println();
		t1.set(0, 'C'); // 섭씨 영도 -> 화씨
		t2.set(32, 'F'); // 화씨 32도  -> 섭씨
		System.out.println("Here are the two temperatures:");
		System.out.println();
		t1.writeOutput();
		t2.writeOutput();
		System.out.println();
		System.out.println("Verify results: should be true.");
		System.out.println();
		System.out.println(t1.degree == t2.degree);
		System.out.println();
		System.out.println("==========================================");
		
		System.out.println();
		System.out.println("Test Case 28: is -40 degrees C = -40 degrees F?");
		System.out.println();
		t1.set(-40, 'C');
		t2.set(-40, 'F');
		System.out.println("Here are the two temperatures:");
		System.out.println();
		t1.writeOutput();
		t2.writeOutput();
		System.out.println();
		System.out.println("Verify results: should be true.");
		System.out.println();
		System.out.println(t1.degree == t2.degree);
		System.out.println();
	}
	
	public Temperature() {
		this.scale = 'C';
		this.degree = 0;
	}
	
	public Temperature(double degree) {
		this.degree = degree;
	}
	
	public Temperature(char scale) {
		this.scale = scale;
	}
	
	public Temperature(double degree, char scale) {
		this.degree = degree;
		this.scale = scale;
	}
	
	public void set(double d, char s) {
		if(s == 'C') this.degree = (double)((d*9/5)+32);
		else if(s == 'F') this.degree = (double)((d-32.0)*5/9); 
	}
	
	public void writeOutput() {
		System.out.println(this.degree);
	}
	
	public void readInput() {
		Scanner s = new Scanner(System.in);
		System.out.print("Input number of degree : ");
		double t = s.nextDouble();
		
		this.degree = t;
	}

}
