import java.util.Scanner;
public class Average{
    public static void main(String[]args){
        short num1,num2,num3,num4,num5,total;
        float ave;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter 5 numbers to calculate average:\nNumber1:");
        num1=(short)(sc.nextInt());
        System.out.println("Number 2:");
        num2=(short)(sc.nextInt());
        System.out.println("Number 3:");
        num3=(short)(sc.nextInt());
        System.out.println("Number 4:");
        num4=(short)(sc.nextInt());
        System.out.println("Number 5:");
        num5=(short)(sc.nextInt());
        total=(short)(num1+num2+num3+num4+num5);
        ave=(total/5.0f);
        System.out.println("Entered numbers are :"+num1+","+num2+","+num3+","+num4+"and"+num5);

        System.out.println("sum of these 5 numbers is :"+total);
        System.out.println("Average is:"+ave);

    }
}