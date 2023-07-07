
import java.util.Scanner;
public class Que10{
    public static void main(String[]args){
        float radius,height,result;
        Scanner sc=new Scanner(System.in);
        System.out.println("radius");
        radius=sc.nextFloat();
        System.out.println("height");
        height=sc.nextFloat();
        result=(3.14f*radius*radius*height);
        System.out.println("result" +result);
        

    }
}