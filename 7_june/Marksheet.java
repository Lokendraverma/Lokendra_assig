import java.util.Scanner;
public class Marksheet{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks of maths");
        int maths=sc.nextInt();
        System.out.println("enter the marks of science");
        int science= sc.nextInt();
        System.out.println("enter the marks of social");
        int social=sc.nextInt();
        System.out.println("enter the marks of hindi");
        int hindi=sc.nextInt();
        System.out.println("enter the marks of english");
        int english=sc.nextInt();
        int total= maths+science+social+hindi+english;
        double percentage=total/5;
        System.out.println("percentage"+percentage);
        String division = (percentage>60)?"1st division":((percentage<59)&&(percentage<50))?"2nd division":((percentage>33)&&(percentage<33))?"3rd division":"your are fail";
        System.out.println(division);
    }
}