package ProgramsCC;

public class RemoveJunkFromString {
    public static void main(String[] args) {

        // Regular Expression : [^a-zA-Z0-9]
        String s = "fgvjyugyhbbb@@@%565^^^   j87699878787@#$%";
        System.out.println(s.replaceAll("[^a-zA-Z0-9]",""));
    }
}
