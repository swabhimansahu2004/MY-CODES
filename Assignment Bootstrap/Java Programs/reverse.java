public class reverse {
    public static void main(String[]args){
        int a,num=-12321;
        int rev=0;
        a=num;
        while(num!=0){
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println(rev);
if(a==rev){
    System.out.println(true);
}
else{
    System.out.println(false);
}
    }
    
}
