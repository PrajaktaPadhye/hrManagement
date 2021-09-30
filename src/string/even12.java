package string;
import java.util.Scanner;
import java.lang.*;
public class even12 {
public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		java.lang.String str;

		
		  System.out.println("enter the String");
		  
		  str= scanner.next();
		  
		  char ch = str.charAt(0);
		  //System.out.println("first character is " +ch);
		  
		  if(Character.isUpperCase(ch)) {
			  
			  System.out.println(str.toUpperCase());

		  }
		  else {
			  System.out.println(str.toLowerCase());
		  }
		 
		 
	}

}

