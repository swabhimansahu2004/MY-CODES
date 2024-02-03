import java.util.Scanner;
public class Simple_Calculator_using_Wrapper_Class {
    public static void main(String []args){
        Scanner scnr=new Scanner(System.in);
        String expression=scnr.nextLine();
        String[] tokens = expression.split("(?<=[-+*/])|(?=[-+*/])");
        int operand1=Integer.valueOf(tokens[0]);
        int operand2=Integer.valueOf(tokens[2]);
        String operation=String.valueOf(tokens[1]);
        int output;
        switch(operation){
            case "+":
            output=operand1+operand2;
            System.out.println(expression+" = "+output);
            break;
            case "-":
            output=operand1-operand2;
            System.out.println(expression+" = "+output);
            break;
            case "*":
            output=operand1*operand2;
            System.out.println(expression+" = "+output);
            break;
            case "/":
            output=operand1/operand2;
            System.out.println(expression+" = "+output);
            break;
        }


    }
}
