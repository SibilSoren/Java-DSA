import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        int number = 12321;
        boolean result = palindrome(number);
        System.out.println(result);
    }

    public static boolean palindrome(int number){
        boolean result = false;
        int copy = number,reverseNum = 0;

        while (number > 0){
            int remainder = number %10;
            reverseNum = (reverseNum * 10) + remainder;
            number = number / 10;
        }
        if(copy == reverseNum){
            result = true;
        }
        return result;
    }
}
