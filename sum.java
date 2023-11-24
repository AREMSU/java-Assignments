import java.util.Scanner;
public class sum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int sum = 0;
        while (num != 0){
            int s = num % 10;
            sum = sum + s;
            num = num / 10;
        }
        System.out.println("The sum of individual numbers of given integer is "+ sum);
    }
}