import java.util.*;
public class Division
{
    public String divideTwoNumbers(int number1,int number2){
        String returnString = "";
        try{
            
            //to monitor Exception
            int result=number1/number2;
        	returnString= "The answer is "+result;
        }
        catch(ArithmeticException e){
            returnString="Division by zero is not possible";
        }
        finally{
            returnString+=". Thanks for using the application.";
        }
      return returnString;
    }
     public static void main (String[] args) {
        /* code */
        int a,b;
        Division d=new Division();
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter the numbers");
        a=inp.nextInt();
        b=inp.nextInt();
        String str;
        str=d.divideTwoNumbers(a,b);
        System.out.println(str);
    }
    
}
