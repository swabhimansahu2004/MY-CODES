public class combine_numbers {
    public static void main(String[]args){
        int a=1265432334;
        int b=45678;
        int sizeofa=(int)Math.log10(a)+1;
        int num1=a/(int)(Math.pow(10,sizeofa-2));
        System.out.println(num1);
        int num2=b%100;
        System.out.println(""+num1+num2);
    }
}
