import java.util.Scanner;
public class Next{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the first number");
        int a = sc.nextInt();
        System.out.println("enter the second number");
        int b = sc.nextInt();
        int sum = a+b;
        
        System.out.println( "The sum is : " + sum);
    }
}
