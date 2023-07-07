public class ID{
    public static void main(String[]args){
        int a,b,c;
        a=10;
        b=20;
        c=30;
        a=++b;
        b=c++;
        c=++a;
        a=++b;
        b=a++;
        c=++a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
    }
}