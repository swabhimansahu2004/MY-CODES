public class division {
    public static void main(String[]args){
        int a=90;
        int b=10;
        int quotient=0;
        while(a>=b){
            a=a-b;
            quotient++;
        }
        System.out.println(quotient);
        System.out.println(a);
    }
}
