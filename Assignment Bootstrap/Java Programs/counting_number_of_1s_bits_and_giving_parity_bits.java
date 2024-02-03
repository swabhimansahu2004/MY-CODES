import java.util.Scanner;
public class counting_number_of_1s_bits_and_giving_parity_bits {
public static void main(String[]args){
Scanner scnr=new Scanner(System.in);
int a=scnr.nextInt();
Integer.toBinaryString(a);
int count=select(a);
System.out.println(count);
if(count%2==0){
    System.out.println("parity 0");
}
else{
    System.out.println("parity 1");
}

scnr.close();
}
public static int select(int a){
    int count=0;
    while(a!=0){
        count=count+(a&1);
        a>>>=1;
    }
    return count;
}
}