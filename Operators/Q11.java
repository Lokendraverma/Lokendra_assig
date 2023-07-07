import java.util.Scanner;
public class Q11{
    public static void main(String[]args){
        double principle,rate,time,compoundInterest;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a principle number:");
        principle = sc.nextInt();
        System.out.println("Enter a Interest rate:");
        rate = sc.nextInt();
        System.out.println("Enter a time period in years:");
        time = sc.nextInt();
        compoundInterest = principle*(Math.pow((1 + rate/100),time))-principle;
        System.out.println("Compound Interest is:"+compoundInterest);
    }
}