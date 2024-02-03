public class prime {
    public static void main(String[]args){
int count=0;
int n=2;
while(count < 100){
    int m=n/2;
    int c=1;
        for(int i=1;i<=m;i++){
            if(n%i==0){
                c++;
            }
        }
        if(c==2){
            System.out.println(n);
            count++;
    }
    n++;
}
}
}
