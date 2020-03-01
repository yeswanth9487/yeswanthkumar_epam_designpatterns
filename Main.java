import java.util.*;
public class Main 
{
	public static void main(String args[])

	{

		String op;

		int num1,num2,result=0;

		Scanner sc=new Scanner(System.in);

		while(true)

		{

			

			System.out.println("Enter two Numbers:");

			num1=sc.nextInt();

			num2=sc.nextInt();

			

			System.out.println("Enter the operator");

			op=sc.next();

					

			Math operator;

			

			switch(op)

			{

				case "+":

					operator=new AADD();

					result=operator.calculate(num1, num2);

					break;

				case "-":

					operator=new SUB();

					result=operator.calculate(num1, num2);

					break;

				case "*":

					operator=new MULT();

					result=operator.calculate(num1, num2);

					break;

				

				case "/":

					operator=new DIV();

					result=operator.calculate(num1, num2);

					break;

					

				default:

					System.out.println("Invalid operator");		

				

			}

			System.out.println(num1+" "+op+" "+num2+" = "+result);			

		}

	

	}



}