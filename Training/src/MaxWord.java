import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class MaxWord {

	public static void main(String[] args) {
		
//		String  Value="The jmz technology";
//		String last=" ";
//		String[] max=Value.split(" ");
//		for(int i=0;i<max.length-1;i++) {
//				for(int j=1+i;j<max.length;j++)
//		         {
//					if(max[i].length()<=max[j].length())
//			         last=max[i];
//		         }
//				System.out.println(last);
		 
		
		Scanner in = new Scanner(System.in);
	       System.out.println("Enter a word or sentence:");
	       String str = in.nextLine();
	       
	       str += " "; //Add space at end of string
	       String word = "", lWord = "";
	       int len = str.length();
	       
	       for (int i = 0; i < len; i++) {
	           char ch = str.charAt(i);
	           if (ch == ' ') {
	               
	                if (word.length() > lWord.length())
	                    lWord = word;
	                    
	                word = "";
	           }
	           else {
	               word += ch;
	           }
	       }
	       
	       System.out.println("The longest word: " + lWord +
	        ": The length of the word: " + lWord.length());
	}
		

}
