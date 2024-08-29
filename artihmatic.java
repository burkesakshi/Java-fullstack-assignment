package assignment;

import java.util.Scanner;

public class artihmatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,solution=0,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetre two numbers:");
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		 System.out.println("1.Addition");
		 System.out.println("2.Subtraction");
		 System.out.println("3.Multiplication"); 
		 System.out.println("4.Division");
		 System.out.println("5.modulus");
		 
		System.out.println("Select the case:");
		i=sc.nextInt();
		switch (i)
		{
		case 1:
		{solution=num1+num2;
			System.out.println("Addition :"+solution);
			break;
		}
		case 2:
		{
			solution=num1-num2;
			System.out.println("Substraction :"+solution);
			break;
		}
		case 3:
			
			solution=num1*num2;
			System.out.println("multiplication: "+solution);
			break;
		case 4:
		{
			solution=num1/num2;
			System.out.println("Division: "+solution);
			break;
		}
		case 5:
		{
			solution=num1%num2;
			System.out.println("Modulus: "+solution);
			break;
		}
		default:
			System.out.println("Invalid input");
		
		}
		
		
	}

}
