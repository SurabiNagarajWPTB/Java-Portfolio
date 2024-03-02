package Week05;

import java.util.Scanner;
public class vowelOrnot
{
	public static void main(String args[]) {

		boolean isvowel=false;
		System.out.println("Enter a character/alphabet:");
		Scanner sc = new Scanner(System.in);
		char ch=sc.next().charAt(0);
		switch(ch)
		{
		case'A':	
		case'E':
		case'I':
		case'O':
		case'U':	
		case'a':
		case'e':
		case'i':
		case'o':	
		case'u':isvowel= true;
		}
		if(isvowel==true)
		System.out.println(ch+" is an vowel ");
		else
		System.out.println(ch+" is a consonant ");
		sc.close();
	}
}