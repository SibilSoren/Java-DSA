import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result = reverseNumber(number);
        System.out.println("The reserve of " + number + " is: " + result);
    }
    public  static  int reverseNumber(int number){
        int revNumber = 0;
        while (number > 0){
            int remainder = number%10;
            revNumber = (revNumber * 10) + remainder;
            number = number / 10;
        }
        return revNumber;
    }
}
