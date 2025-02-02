package ProgramsCC;

public class PrimeNumber {

    public static boolean isPrime(int num)
    {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void getPrimeNumbers(int num)
    {
        for (int i = 2; i <= num; i++) {
            if(isPrime(i))
            {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {

        System.out.println("2 is prime or not : "+isPrime(2));
        System.out.println("Prime numbers till 50 : ");
        getPrimeNumbers(50);
    }
}
