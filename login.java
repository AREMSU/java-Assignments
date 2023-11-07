import java.util.Scanner;
public class login{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                System.out.println("Please set a username");
                String set_username = sc.nextLine();
                System.out.println("Please set a password containing atleast 8 characters and @: ");
                String set_password = sc.nextLine();
                if (set_password.length()>7 & set_password.contains("@")){
                    System.out.print("your account has been created successfully");
                }
                else{
                    System.out.println("account creation failed successfully");
                }
        System.out.println("Please enter your username");
        String username = sc.nextLine();
        System.out.println("Please enter your password");
        String password = sc.nextLine();
        if (username.equals(set_username)&password.equals(set_password)){
            System.out.print("login successful");
        }
        else{
            System.out.println("wrong username or password");
        }
    }
}