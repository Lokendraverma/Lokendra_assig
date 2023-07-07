import java.util.Scanner;
public class Que15{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter character:");
        char ch = sc.next().charAt(0);
        String c = (ch>='A'&& ch<='Z')?"upper ": "lower" ;
        System.out.println("character "+ c);
    }
}