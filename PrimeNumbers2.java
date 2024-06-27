import java.util.Scanner;

public class PrimeNumbers2{
	//Variables to store the lower and upper limits
	private int lowerLimit;
	private int upperLimit;
	
	public PrimeNumbers2(int lowerLimit, int upperLimit) {
		this.lowerLimit = lowerLimit;
		this.upperLimit = upperLimit;
	}
	
	public boolean isPrime(int n){
		//Check if n is a multiple of 2
		if (n%2==0) return false;
		//if not, then just check the odds
		for(int i = 3; i * i <= n; i += 2){
			if(n % i == 0)
				return false;
		}
		return true;
	}
	
	public void calculatePrimeNumbers() {
		System.out.println("Prime numbers between " + lowerLimit + " and " + upperLimit + ":");
		int count = 0; //To count the prime numbers
		for(int i = lowerLimit; i <= upperLimit; i++) {
			if(isPrime(i)) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println("\nTotal number of prime numbers = " + count);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter lower limit: ");
		int lowerLimit = sc.nextInt();
		System.out.print("Enter upper limit: ");
		int upperLimit = sc.nextInt();
		sc.close();
		PrimeNumbers2 numbers = new PrimeNumbers2(lowerLimit, upperLimit);
		numbers.calculatePrimeNumbers();
	}
}