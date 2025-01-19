package ProgramsCC;

public class ReverseAnInteger {
    public int rev(int n)
    {
        int rev = 0;

        while (n !=0) {

            int rem = n % 10;
            rev = rev * 10 + rem;
            n= n / 10;
        }

        return rev;
    }

    public static void main(String[] args) {
        int number = 12345;
        ReverseAnInteger raInt = new ReverseAnInteger();
        int revNum =  raInt.rev(number);
        System.out.println(revNum);
        System.out.println(new StringBuffer(String.valueOf(number)).reverse());
    }
}
