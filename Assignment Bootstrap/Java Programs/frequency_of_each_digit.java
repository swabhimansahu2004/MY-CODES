public class frequency_of_each_digit {
    public static void main(String[]args){
        int n=1224325;
       for(int i=0;i<=9;i++){
        int count=0;
        int temp=n;
        while(temp!=0){
            int digit=temp%10;
            if(digit==i){
                count++;
            }
            temp=temp/10;
        }
        System.out.println(i+" has count of "+count);
       }
    }
}
