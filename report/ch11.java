
public class ReportCh11 {
    public static void main(String[] args) {
        String[][] data1 = {
        					{"A","B"},
			                {"1","2"},
			                {"XX","YY","ZZ"}
			               };
        
        String[][] data2 = {
							{"A"},
							{"1"},
							{"2"},
							{"XX", "YY"}
							};
			
		String[][] data3 = {
							{"A", "B"},
							{"1", "3"},
							{"2"},
							{"XX", "YY"}
							};
		
		int[] allLen1 = getLengths(data1); // 각 줄에 대한 길이 
		int[] allLen2 = getLengths(data2);
        int[] allLen3 = getLengths(data3);
        int[] count1 = {0, 0};
        int[] count2 = {0, 0};
        int[] count3 = {0, 0};
        
        System.out.println("*** Show data1 combination ***\n");
        printCombinations(data1, allLen1, count1);
        System.out.println("\n*** Show data2 combination ***\n");
        printCombinations(data2, allLen2, count2);
        System.out.println("\n*** Show data3 combination ***\n");
        printCombinations(data3, allLen3, count3);
    }

    
    /* Find correct row column using remainder operator
    Combination #11, combo count starts at 0
      rowLengths: 2, 2, 3
      11 % 3  =  2 last element of line
      11 / 3 % 2  = 3 % 2 = 1 middle element
      11 / 3 / 2 % 2  = 1 % 2 = 1 first element
      */
	static void printCombinations(String[][] arr, int[]allLengths, int[]cnt){
	// Count up to the number of combos in an array
	 int countCombos = cnt[0]; // 조합의 개수 
	 int countArrayLength = cnt[1]; // 각 줄의 길이
	 
	 if(countCombos < allLengths[arr.length] ){
	     if(cnt[1] < arr.length) {
	         int row = countCombos / allLengths[countArrayLength]; // 어떤 행(세로)의 열(가로)!
	         int counter = countArrayLength;
	         
	         row = row % arr[counter].length;
	         
	         if (cnt[1] != 0) System.out.print(" ");
	         System.out.print(arr[countArrayLength][row]);
	         countArrayLength++;
	     } 
	     else {
	         countArrayLength = 0;
	         countCombos++;
	         System.out.println();
	     }
	 } 
	 else return;
	
	 cnt[0] = countCombos;
	 cnt[1] = countArrayLength;
	 printCombinations(arr, allLengths, cnt);
	}
	
	// Count every element in the array
	// Get length of each internal array, output to int array
	
	public static int[] getLengths (String[][] arr){
	 /* allLengths lengths will count all elements up until the end of that row, starting at 0
	     the last number of the array is the total number of combinations possible*/
	 int[] allLengths = new int[arr.length + 2];
	 int arrlen = arr.length;
	 int totalCombinations = 1;
	 // First element in int array is total count of combinations of elements
	 allLengths[0] = 1;
	 for (int i = arrlen - 1; i >= 0; i--) {
	     allLengths[i] = totalCombinations;
	     totalCombinations *= arr[i].length;

	     if (allLengths[i] <= 0)
	         throw new IllegalStateException("Empty object in in multi-dimensional array");
	 }
	 allLengths[arrlen] = totalCombinations;
	 return allLengths;
	}
}
