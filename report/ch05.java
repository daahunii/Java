//22100661 Jeongdahun
/* Report Chapter 05 */
/*
Create a class that represents a grade distribution for a given course. Write methods to perform the following tasks:
• Set the number of each of the letter grades A, B, C, D, and F.
• Read the number of each of the letter grades A, B, C, D, and F.
• Return the total number of grades.
• Return the percentage of each letter grade as a whole number between 0 and 100, inclusive.
• Draw a bar graph of the grade distribution.

The graph will have five bars, one per grade.
Each bar can be a horizontal row of asterisks, such that the number of asterisks in a row is proportionate to the percentage of grades in each category.
Let one asterisk represent 2 percent, so 50 asterisks correspond to 100 percent.
Mark the horizontal axis at 10 percent increments from 0 to 100 percent, and label each line with its letter grade.

For example, if the grades are 1 A, 4 Bs, 6 Cs, 2 Ds, and 1 F, the total number of grades is 14,
the percentage of As is 7, the percentage of Bs is 29, the percentage of Cs is 43, the percentage of Ds is 14, and the percentage of Fs is 7.
The A row would contain 4 asterisks (7 percent of 50 rounded to the nearest integer), the B row 14, the C row 21, the D row 7, and the F row 4.
*/
import java.util.Scanner;

public class ReportCh05 {
	private static int a, b, c, d, f;
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
        System.out.println("        Get Grade Counts         ");
        System.out.print("\nEnter number of letter grade A: ");
        a = keyboard.nextInt();
        System.out.print("Enter number of letter grade B: ");
        b = keyboard.nextInt();
        System.out.print("Enter number of letter grade C: ");
        c = keyboard.nextInt();
        System.out.print("Enter number of letter grade D: ");
        d = keyboard.nextInt();
        System.out.print("Enter number of letter grade F: ");
        f = keyboard.nextInt();

        System.out.println();
        System.out.println("0   10   20   30   40   50   60   70   80   90   100%");
        System.out.println("|    |    |    |    |    |    |    |    |    |    |");
        System.out.println("***************************************************");
        
        int totalGrades = a+b+c+d+f;
        int Acent = (a*100/totalGrades);
        int Bcent = (b*100/totalGrades);
        int Ccent = (c*100/totalGrades);
        int Dcent = (d*100/totalGrades);
        int Fcent = (f*100/totalGrades);
        
        for(int i=0; i<Acent/2; i++) System.out.print("*");
        System.out.print(" A");
        System.out.println();
        
        for(int i=0; i<Bcent/2; i++) System.out.print("*");
        System.out.print(" B");
        System.out.println();
        
        for(int i=0; i<Ccent/2; i++) System.out.print("*");
        System.out.print(" C");
        System.out.println();
        
        for(int i=0; i<Dcent/2; i++) System.out.print("*");
        System.out.print(" D");
        System.out.println();
        
        for(int i=0; i<Fcent/2; i++) System.out.print("*");
        System.out.print(" F");
    }

}
