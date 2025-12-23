import java.util.Scanner;
class Reverse
{
	public static void main(String args[])
	{
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rev = 0;
		while(n>0)
		{
			int  d = n% 10;
			rev = rev * 10 + d;
			n = n / 10;
		}
		System.out.println("Reverse_Integer :"+ " " +rev);
	}
}


#Reversing numbers in an array

	
import java.util.Scanner;
class ReverseNum
{
	public static void main(String args[])
	{
		System.out.println("Enter the size of an array:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter" +n + "numbers");
		for(int i=0; i<n ; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i< n ; i++)
		{
			int num = arr[i];
			int rev = 0;
			while(num>0)
			{
				int  d = num% 10;
				rev = rev * 10 + d;
				num = num / 10;
			}
			System.out.println("Reverse_Integer :"+ " " +rev);
		}
	}
}
