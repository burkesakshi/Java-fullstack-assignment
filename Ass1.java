import java.util.Scanner;

public class Ass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNum,secondNum,solution;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two number:");
		firstNum=sc.nextInt();
		secondNum=sc.nextInt();
		solution=(firstNum-secondNum*(firstNum/secondNum));
		System.out.println("Reminder is: "+solution);
	}

}
