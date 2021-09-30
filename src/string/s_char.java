package string;
import java.util.Scanner;
public class s_char {
	
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] array = {10,52,64,99,20};
		
		int count=0;
		
		for (int i = 0; i < array.length; i++) 
		{
			
			if( array[i]%2 == 0) 
			{
				count++;
			}
		}
		System.out.println(count);

	}
}
