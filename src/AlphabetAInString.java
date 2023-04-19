import java.util.Scanner;

public class AlphabetAInString {


    public static void main(String[] args) {
        System.out.println("input any name ");// input any name ex amaandeep


    Scanner scanner = new Scanner(System.in);
    String hello = scanner.nextLine();

        System.out.println("number of character A is");
    int charCount = hello.length() - hello.replaceAll("a", "").length();
         System.out.println(charCount);
}
}
