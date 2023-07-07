import java.util.Scanner;
public class Que8{
    public static void main(String[]args){
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter 1st number");
         a=sc.nextInt();
        System.out.println("Enter 2nd number");
         b=sc.nextInt();
        c=a;
        a=b;
        b=c;
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}