import java.util.Scanner;
public class Relational{
    public static void main(String[]args){
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number");
        a=sc.nextInt();
        System.out.println("Enter 2nd number");
        b=sc.nextInt();
        boolean result1= a>b;
        boolean result2= a<b;
        boolean result3= a==b;
        boolean result4= a<=b;
        boolean result5= a>=b;
        boolean result6= a!=b;

         System.out.println(result1);
         System.out.println(result2);
         System.out.println(result3);
         System.out.println(result4);
         System.out.println(result5);
         System.out.println(result6);
    }
}