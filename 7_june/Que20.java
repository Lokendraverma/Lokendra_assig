
//20. Swap without using third variable and without using + , - operator


import java.util.Scanner;
public class Que20{
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number");
    int firstNum = sc.nextInt();
    
    System.out.println("Enter the second number");
    int secondNum = sc.nextInt();
    
    firstNum =firstNum^secondNum;
    secondNum=firstNum^secondNum;
    firstNum=firstNum^secondNum;

System.out.println("After  swapping the value of first and second num is");
System.out.println("firstnum = "+firstNum);
System.out.println("secondnum = "+secondNum);

}
}
