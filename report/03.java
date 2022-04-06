// Check for a valid date
import java.util.Scanner;
public class ReportCh03 {

	public static void main(String[] args) {
		char ans = 'y';
		Scanner s = new Scanner(System.in);
		
		do {
		System.out.printf("Input date(mm/dd/yyyy) : ");
		String date = s.next();
		
		String[] resultDate = date.split("/");
        
        int[] integerDate = new int[3]; // string -> int로 변환
        for(int i=0; i<resultDate.length; i++) integerDate[i] = Integer.parseInt(resultDate[i]);
        //  integerDate[0] = mm, integerDate[1] = dd, integerDate[2] = yyyy
         if(integerDate[2]%4 == 0 || integerDate[2]%400 == 0 && integerDate[2]%100 != 0) { // 윤년일 때
    		if(integerDate[0] == 1 || integerDate[0] == 3 || integerDate[0] == 5 || integerDate[0] == 7 || integerDate[0] == 8 || integerDate[0] == 10 || integerDate[0] == 12) {
    			if(integerDate[1]>0 && integerDate[1]<32) System.out.println("It is a valid date!");
    			else System.out.println("It is invalid input!");
    		}
    		else if(integerDate[0] == 4 || integerDate[0] == 6 || integerDate[0] == 9 || integerDate[0] == 11) {
    			if(integerDate[1]>0 && integerDate[1]<31) System.out.println("It is a valid date!");
    			else System.out.println("It is invalid input!");
    		}
    		else if(integerDate[0] == 2) {
    			if(integerDate[1]>0 && integerDate[1]<30) System.out.println("It is a valid date!");
    			else System.out.println("It is invalid input!");
    		}
    		else System.out.println("It is invalid input!");
         }
         
         else {
        	 if(integerDate[0] == 1 || integerDate[0] == 3 || integerDate[0] == 5 || integerDate[0] == 7 || integerDate[0] == 8 || integerDate[0] == 10 || integerDate[0] == 12) {
     			if(integerDate[1]>0 && integerDate[1]<32) System.out.println("It is a valid date!");
     			else System.out.println("It is invalid input!");
     		}
     		else if(integerDate[0] == 4 || integerDate[0] == 6 || integerDate[0] == 9 || integerDate[0] == 11) {
     			if(integerDate[1]>0 && integerDate[1]<31) System.out.println("It is a valid date!");
     			else System.out.println("It is invalid input!");
     		}
     		else if(integerDate[0] == 2) {
     			if(integerDate[1]>0 && integerDate[1]<29) System.out.println("It is a valid date!");
     			else System.out.println("It is invalid input!");
     		}
     		else System.out.println("It is invalid input!");
         }
         
         System.out.printf("Should I continue? (yes : y, no : n) : ");
         ans = s.next().charAt(0);
		}while(ans == 'y');
		
		System.out.println("exit!");
	}

}
