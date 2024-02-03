public class reversing_bits {
public static int rev(int a){
    int rev=0;
    while(a>0){
        rev=rev<<1;
        if((int)(a&1)==1){
            rev=rev^1;
        }
        a>>=1;
    }
    return rev;
}
public static void main(String[]args){
    int a=20;
    System.out.println(a);
    System.out.println(Integer.toBinaryString(a));
    System.out.println(Integer.toBinaryString(rev(a)));
}
}