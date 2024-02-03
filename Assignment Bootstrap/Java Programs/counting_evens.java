public class counting_evens {
    public static void main(String[]args){
        int a=1234567890;
        int count=0;
        while(a!=0){
            int rem=a%10;
            if(rem%2==0){
                count++;
            }
            a=a/10;
        }
        System.out.println(count);
    }
}
