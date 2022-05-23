import java.util.Scanner;
public class ReportCh07 { 

	private static String sen;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		do {
			String ans = "n";
			System.out.println("Enter a line of text");
			System.out.println("terminated by a period.");
			sen = s.nextLine();
			
			convertPrint(sen.toUpperCase());
			System.out.println("Enter another line? (y for \'yes\')");
			ans = s.nextLine();
			if(ans.equals("n") || ans.equals("no")) break;
			
		} while(true);
		
		System.out.println("Program exit!");
	}
	
	public static void convertPrint(String word) {
		int[] temp = new int[255];
		for(int i=0; i<sen.length(); i++) {
			temp[word.charAt(i)]++;
		}
		
		for(int i='A'; i<'Z'; i++) {
			if(temp[i] == 0) continue;
			System.out.printf("%c %d\n", i, temp[i]);
		}
	}
}
