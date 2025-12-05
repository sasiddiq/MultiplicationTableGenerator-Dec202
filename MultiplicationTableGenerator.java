package day5;

import java.util.Scanner;

public class MultiplicationTableGenerator {

	public static void main(String[] args) 
	{
		System.out.println("Enter a number to print its multiplication table");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        
        System.out.println("Multiplication Table for "+number+":");
        for (int i=1; i<=10; i++)
        {
        	int result = number*i;
        	//System.out.println(result);
        	System.out.println(number + " x "+i+ " = "+result);
        	
        }
	}

}
