public class diff_epsillon {
    public static void main(String[]args){
    float a=12.12345678f;
    float b=12.12345677f;
    float diff=Math.abs(a)-Math.abs(b);
    float epsillon=0.000001f;
    if(diff<=epsillon){
        System.out.println("same");
    }
    else{
        System.out.println("different");
    }
    }
    
}
