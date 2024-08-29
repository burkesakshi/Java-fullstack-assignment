package assignment;

import java.util.Scanner;

public class swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,temp=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two no:");
		num1=sc.nextInt();
		num2=sc.nextInt();
		System.out.println("Before swapping:"+num1+" "+num2);
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("After Swapping "+num1+" "+ num2);
		
		

	}

}
