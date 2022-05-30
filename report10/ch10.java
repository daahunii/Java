/* Search word program */
import java.io.*;
import java.util.Scanner;

public class searchWord {

	public static void main(String[] args) {
		String filename = "searchWordList.txt";
		String filename2 = "words.txt";
		PrintWriter outputStream = null;
		
		try{
			Scanner s1 = new Scanner(new File(filename));
			outputStream = new PrintWriter("result.txt");
			
			while(s1.hasNextLine()) {
				String line = s1.nextLine();
//				System.out.println("## Word list containing String \""+line+"\" ##");
				outputStream.write("## Word list containing String \""+line+"\" ##\n");
				
				findWord(filename2, line, outputStream);
			}
			
			s1.close();
			outputStream.close();
			
        }catch (FileNotFoundException e) {
        	System.out.println("Cannot find file " + filename);
        	System.exit(0);
        }catch(IOException e){
        	System.out.println("Problem with input from file " + filename);
        }
		System.out.println("\nresult.txt created successfully!");
	}

	public static void findWord(String file, String word, PrintWriter printWord) {
		try {
			Scanner s = new Scanner(new File(file));
			while(s.hasNextLine()) {
				String line2 = s.nextLine();
				if(line2.contains(word)) {
//					System.out.println(line2);
					printWord.write(line2+"\n");
				}
				else continue;
			}
//			System.out.println();
			printWord.write("\n");
			s.close();
			
		}catch (FileNotFoundException e) {
        	System.out.println("Cannot find file " + file);
        	System.exit(0);
        }catch(IOException e){
        	System.out.println("Problem with input from file " + file);
        }
		
	}
}



/* result.txt */
/*
## Word list containing String "dous" ##
douse
doused
douser
dousers
douses
dousing
hazardous
horrendous
jeopardous
stupendous
tremendous

## Word list containing String "ish" ##
abolish
abolished
abolisher
abolishers
abolishes
abolishing
accomplish
actorish
.
.
.
.
.
.

*/

