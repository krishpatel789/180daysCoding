import java.util.Scanner;
class io
{
	public static void main(String args[])
 	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=sc.nextInt();
		System.out.println("Enter a string ");
        String name=sc.nextLine();
		for(int i=0;i<number;i++)
                {
			System.out.println(name);
           	}
	}
}
		