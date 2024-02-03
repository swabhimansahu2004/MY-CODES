public class swapping_positions_in_bits {
    public static void main(String[]args){
        int a=90;
        int i=2;
        int j=4;
        System.out.println(a);
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(swap(a,i,j)));
    }
    public static int swap(int a,int i, int j){
        if(((a>>i)&1)!=((a>>j)&1)){
            a=a^((1<<i)|(1<<j));
        }
        return a;
    }
}
