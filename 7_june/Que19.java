
import java.util.Scanner;
class Que19{
    public static void main(String[] args) {

        System.out.printf("Enter any character : ");
        Scanner sc = new Scanner(System.in);
        char ch=sc.nextLine().charAt(0);
      String s= (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')?"Entered Character is a vowel":"Entered Character is not a vowel It's a Consonent";
        System.out.println(s);
    }
}