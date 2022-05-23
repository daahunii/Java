// Date Format Conversion
import javax.swing.*; 
public class ReportCh02 {

	public static void main(String[] args) {
		JFrame jFrame = new JFrame();
		int result = 2;
		
		while(result == 2) {
	        String getDate = JOptionPane.showInputDialog(jFrame, "Enter a date in the format month/day/year.\nI will output the date in the format day.month.year");
	
	        // 여기다가 date convert code 작성
	        String[] resultDate = getDate.split("/");
	        if(resultDate[0].length() > 2 || resultDate[1].length() > 2 || resultDate[2].length() > 2) {
	        	JOptionPane.showMessageDialog(jFrame, "Invalid input!");
	        	break;
	        }
	        
	        int[] integerDate = new int[3]; // string -> int로 변환하여 월, 일 판별
	        for(int i=0; i<resultDate.length; i++) {
	        	integerDate[i] = Integer.parseInt(resultDate[i]);
//	        	System.out.println(integerDate[i]);
	        }
	        if(integerDate[0] < 1 || integerDate[0] > 12) {
	        	JOptionPane.showMessageDialog(jFrame, "Invalid input!");
	        	break;
	        }
	        if(integerDate[1] > 31 || integerDate[1] < 1) {
	        	JOptionPane.showMessageDialog(jFrame, "Invalid input!");
	        	break;
	        }
	        
	        JOptionPane.showMessageDialog(jFrame, getDate+" converts to: "+ resultDate[1]+"."+resultDate[0]+"."+resultDate[2]+".");
	        result = JOptionPane.showConfirmDialog(jFrame, "프로그램을 종료하시겠습니까?", "종료", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null);
		}
	}

}
