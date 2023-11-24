import java.util.Scanner;
public class counter{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String string = sc.nextLine();
        int vowel_count = 0;
        int constant_count = 0;
        int length = string.length();
        for (int i=0; i < length ; i++){
            char a = string.charAt(i);
            if (a != 'a' && a !='e' && a !='i' && a !='o' && a !='u' && a !='A' && a !='E' && a !='I' && a !='O' && a !='U'){
                constant_count = constant_count + 1;
            }
            else{
                vowel_count = vowel_count + 1;
            }
        }
        System.out.println("Total vowels= "+vowel_count);
        System.out.println("Total consonants= "+constant_count);
    }
}