package string;
import java.util.Scanner;
public class practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String x= sc.next();
		String z = null;
		char [] chara = X.toCharArray();
		if(Character.isUpperCase(chara[0])) {
			z= x.toUpperCase();
			System.out.println(z);
		}
		else if(Character.isUpperCase(chara[0])) {
			String z = x.toLowerCase();
			System.out.println(z);
		}
		System.out.println("string after conversion"+x);
	}
	

}
