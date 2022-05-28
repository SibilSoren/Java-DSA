import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int n = input.nextInt();
//        int result = getFibNumber(n);
//
//        System.out.println(result);
            printFiboSeries(n);

    }
    public static int getFibNumber(int n){
        int a = 0 ,b = 1 ,sum = 0;
        for(int i = 2;i<n;i++){
            sum = a + b;
            a = b;
            b = sum;
        }
        return sum;
    }
    public static void printFiboSeries(int n){
        int a = 0 ,b = 1 ,sum = 0;
        System.out.print(a + " " + b);
        for(int i = 2;i<n;i++){
            sum = a + b;
            a = b;
            b = sum;
            System.out.print(" " + sum);
        }
//        return sum;
    }

}
