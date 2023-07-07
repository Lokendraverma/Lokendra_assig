public class Small{
    public static void main(String[]args){
        int a,b,c;
        a=50;
        b=45;
        c=49;
        int smallest = (a<b && a<c) ? a: (b<c) ? b:c;
        System.out.println("smallest="+smallest);

    }
}