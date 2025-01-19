package ProgramsCC;

public class ReverseString {

    public String reverseString(String input)
    {
        int length = input.length();
        String rev = "";

        for(int i = length-1; i>=0; i--)
        {
            rev = rev + input.charAt(i);
        }

        return rev;
    }

    public StringBuffer reverseUsingStringBuffer(String str)
    {
        StringBuffer sf = new StringBuffer(str);
        return sf.reverse();
    }
    public static void main(String[] args) {
        String s = "Selenium";
        ReverseString rStr = new ReverseString();
        String revStr = rStr.reverseString(s);
        StringBuffer revStr2 = rStr.reverseUsingStringBuffer(s);
        System.out.println("1 : "+revStr);
        System.out.println("2 : "+revStr2);
    }
}
