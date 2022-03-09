import java.util.Scanner;

class Alphabets {
    public static void main(String[] args) {

		char c = 'A';

		System.out.print("Upper Case Alphabets Displayed \n");
		while (c <= 'Z') {
			System.out.print(c + " ");
			c++;
		}

		System.out.print("\n\n");
		c = 'a';
		System.out.print("Lower Case Alphabets Displayed \n");
		while (c <= 'z') 
		{
			System.out.print(c + " ");
			c++;
		}
	}
}