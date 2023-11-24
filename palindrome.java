import java.util.Scanner;
public class palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String string = sc.nextLine();
        String check = string;
        String reverse = "";
        for (int i = string.length()-1; i >= 0; i--) {
            char a = string.charAt(i);
            reverse = reverse + a;
        }
        System.out.println(reverse);
        if (reverse.equals(check)){
            System.out.println("The entered string is a palindrome");
        }
        else{
            System.out.println("The entered string is not a palindrome");
        }
    }
}