import java.util.Scanner;
public class Que14{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a lowercase");
        String lowercase=sc.nextLine();
        String uppercase=lowercase.toUpperCase();
        System.out.println("result is"+uppercase);

        
    }
}