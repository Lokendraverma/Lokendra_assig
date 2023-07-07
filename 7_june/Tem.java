import java.util.Scanner;
public class Tem{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the tempreture");
        Double Fehrenheit = sc.nextDouble();
        Double celcius = (Fehrenheit-32)*5/9;
        System.out.println("Fehrenheit to celcius"+ celcius);
        
    }
}