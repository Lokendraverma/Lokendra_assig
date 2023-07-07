import java.util.Scanner;
public class Que16{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number :");
        int n1=sc.nextInt();
        System.out.println("Enter 1st number :");
        int n2=sc.nextInt();
        String s=(n1==n2)?"given number are equal":"given number are not equal.";
        int g=(n1>n2)?n1:n2;
        System.out.println(s);
        System.out.println("greatest number between these number is:"+g);
        
    }
}