package practice;

import java.util.Scanner;

public class simpleCompoundInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double Principal, Rate, Time,simpleinterest,compoundinterest;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter principal");
		Principal=sc.nextDouble();
		System.out.println("enter rate");
		Rate=sc.nextDouble();
		System.out.println("enter time");
		Time=sc.nextDouble();
		simpleinterest=Principal*Rate*Time;
		System.out.println("simple interest is"+simpleinterest);
		compoundinterest=Principal*(1 + Rate )*Time-Principal;
		System.out.println("compound interest"+compoundinterest);

	}

}
