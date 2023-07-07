import java.util.Scanner;
public class Simple{
    public static void main(String[]args){
        short p,r,t;
        float simInt,amt;
        Scanner sc=new Scanner(System.in);
        System.out.println("Entered value of principle amount:");
        p=(short)(sc.nextInt());
        System.out.println("Rate:");
        r=(short)(sc.nextInt());
        System.out.println("Time(yearly):");
        t=(short)(sc.nextInt());
        simInt=(p*r*t)/100.0f;
        amt=(float)(p+simInt);
        System.out.println("Entered details are:principal:"+p+",rate:"+r+","+"time:"+t);
        System.out.println("Interest generated is:"+simInt);
        System.out.println("Total Amount generated:"+amt);
    }
}