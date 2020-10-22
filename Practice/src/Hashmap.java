import java.util.*;
import java.util.HashMap;
//import com.sun.tools.classfile.CharacterRangeTable_attribute.Entry; 
public class Hashmap {
	 
	 public static void main(String args[]){  
		 HashMap<String,String> productDetails=new HashMap<String,String>();//Creating HashproductDetails    
		   productDetails.put("lux","soap");  //Put elements in productDetails  
		   productDetails.put("colgate","paste");    
		   productDetails.put("pears","soap");   
		   productDetails.put("sony","electronics"); 
		   productDetails.put("samsung","electronics");    
		   System.out.println(productDetails);
		   
		   HashMap<String,Integer> salesDetails=new HashMap<String,Integer>();//creating second hashproductDetails
		   //System.out.println("Iterating HashproductDetails...");  
		   salesDetails.put("lux", 1000);
		   salesDetails.put("colgate",500);
		   salesDetails.put("pears",2000);
		   salesDetails.put("sony",100);
		   salesDetails.put("samsung",600);
		   System.out.println(salesDetails);
		   
		   //for(Entry<String,String> m : m.entrySet()){    
		    //System.out.println(m.getKey()+" "+m.getValue());    
		   }  
	}  
}

