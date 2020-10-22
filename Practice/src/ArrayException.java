import java.util.*;
//import java.io.Exception;
public class ArrayException{
    public String getPriceDetails()
    {
   
        Scanner sc=new Scanner(System.in);
        try{
        System.out.println("Enter the number of elements in the array");
        int size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("Enter the price details");
        for(int i=0;i<size;i++)
           a[i]=sc.nextInt();
        System.out.println("Enter the index of the array you want to access");
        int ch=sc.nextInt();  
         return "The array element is "+a[ch];
        }
        catch(ArrayIndexOutOfBoundsException e){
               return "Array index is out of range";}
        catch(InputMismatchException e){
            return "Input was not in correct format";}
           
    }    
    public static void main(String[] args){
        ArrayException e=new ArrayException();
        String str=e.getPriceDetails();
        System.out.println(str);
    }
    
}