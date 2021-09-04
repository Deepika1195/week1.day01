package Week1.day1.assignment;

public class PrimerNumberProgram {

	public static void main(String[] args) {
		int num = 13;
		boolean isPrime = true;
		for (int i =1;i<=num/2;i++)
		{
if(num%i==0)
{
	 isPrime = false;
}
else
{
	System.out.println(num +"is a prime number");
}

}
	}
}

