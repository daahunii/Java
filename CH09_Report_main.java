import java.util.Scanner;
public class CH09_Report_main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String ans = "y";
		while(true) {
	        System.out.println("Enter time in 24-hour notation: ");
	        String time = s.next();
	        try {
	            int colon = time.indexOf(":");
	            if (colon < 0)
	                throw new TimeFormatException("There is no such time as " + time);
	            int hour = Integer.parseInt(time.substring(0, colon));
	            int minutes = Integer.parseInt(time.substring(colon + 1));
	            if (hour <= 0 || hour > 24)
	            	throw new TimeFormatException("There is no such time as " + time);
	            if (minutes <= 0 || minutes > 60)
	            	throw new TimeFormatException("There is no such time as " + time);
	            String ampm = "am";
	            if (hour >= 12) {
	                ampm = "pm";
	                hour = hour - 12;
	            }
	            System.out.println("That is the same as\n" + hour + ":" + minutes + ampm);
	            System.out.println("Again?(y/n)");
	            ans = s.next();
	            if(ans.equals("n")) break;
	        }
	        catch (TimeFormatException e) {
	            System.out.println(e.getMessage());
	            System.out.println("Try Again:");
	        }
		}
		System.out.println("End of program");
	}

}
