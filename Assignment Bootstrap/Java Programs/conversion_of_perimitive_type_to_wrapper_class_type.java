public class conversion_of_perimitive_type_to_wrapper_class_type {
    public static void main(String[]args){
        //converting int to Integer
        int i=10;
        Integer obj1=Integer.valueOf(i);
        Integer obj2=new Integer(i);
        //Both are same
        //converting double to Double
        double a=10.09;
        Double obj3=Double.valueOf(a);
        //converting boolean to Boolean
        boolean b=true;
        Boolean obj4=Boolean.valueOf(b);
        //read int,double,float,boolean as String and convert to Integer,Double,Float,Boolean object
        String c="1234";
        Integer obj5=Integer.valueOf(c);
        String d="12.34";
        Double obj6=Double.valueOf(d);
        String e="1234f";
        Float obj7=Float.valueOf(e);
        String f="true";
        Boolean obj8=Boolean.valueOf(f);
        //read a double number as a string and convert it to a double base type
        String var1="123.098";
        Double obj9=Double.valueOf(var1);//string to Double Object
        double val1=obj9.doubleValue();//Double Object to Double Base type
        //read a int number as a string and convert it to a int base type
        String var2="123";
        Integer obj10=Integer.valueOf(var2);
        int val2=obj10.intValue();



    }
    
}
