import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int elem = sc.nextInt();
        int result = countNumbers(number,elem);
        System.out.println("The number of "+elem+ " in " + number + " is: " + result);
    }

    public static int countNumbers(int number,int elem){
        int count = 0;
        while(number>0){
            int remainder = number%10;
            if(remainder == elem){
                count++;
            }
            number = number / 10;
        }
        return count;
    }

}
