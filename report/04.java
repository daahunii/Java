//Holy digits Batman! The Riddler is planning his next caper
// somewhere on Pennsylvania Avenue. In his usual sporting fashion,
// he has left the address in the form of a puzzle. The address on
// Pennsylvania is a four-digit number where:
// •	 All four digits are different
// •	 The digit in the thousands place is three times the digit in the tens place
// •	 The number is odd
// •	 The sum of the digits is 27
// Write a program that uses a loop (or loops) to find the address where the
// Riddler plans to strike.

import java.util.Scanner;
public class ReportCh04 {

	public static void main(String[] args) {
		int n1, n2, n3, n4; // Thousand, hundred, ten, one
		
		System.out.println("Figure out the address on Pennsylvania.");
		System.out.println("Finding...\n");
		System.out.println("Find it!!");
		System.out.printf("\n=========================================\n");
		
		for(n1 = 0; n1 < 10; n1++) {
			for(n2 = 0; n2 < 10; n2++) {
				for(n3 = 0; n3 < 10; n3++) {
					for(n4 = 0; n4 < 10; n4++) {
						if(n1+n2+n3+n4 == 27) {
							if(n4 % 2 != 0) {
								if((n1!=n2)&&(n2!=n3)&&(n3!=n4)&&(n2!=n4)&&(n1!=n4)) {
									if(n1 == n3*3) System.out.println("The address is "+n1+n2+n3+n4+" Pennsylvania Avenue.");
								}
							}
						}
					}
				}
			}
		}
	}

}
