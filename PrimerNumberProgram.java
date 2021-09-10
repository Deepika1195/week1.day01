package Week1.day1.assignment;

public class PrimerNumberProgram {

	public static void main(String[] args) {
		int num = 13;
		boolean isPrime = true;
		int i = 2;
		if (num % i == 0) {
			isPrime = false;
		} else {
			System.out.println("Prime number is:" + num);
		}

	}
}
