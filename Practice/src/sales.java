import java.util.HashMap;
import java.util.*;
public class sales {
	public static HashMap<String,Integer> priceUpdate(HashMap<String,String> productDetails,
			      HashMap<String,Integer>salesDetails,int rate, String category){
					HashSet<String> items=new HashSet<>();
					for(Map.Entry<String,String> product: productDetails.entrySet()) {
						if(product.getValue().equals(category))
							items.add(product.getKey());
					}
					for(Map.Entry<String,Integer> product: salesDetails.entrySet()) {
						if(items.contains(product.getKey()))
							salesDetails.put(product.getKey(),product.getValue()*(100+rate)/100);
					}
					return salesDetails;
	}
	public static void main(String args[]){  
		 Scanner sc=new Scanner(System.in);
		 HashMap<String,String> productDetails=new HashMap<String,String>();//Creating HashproductDetails    
		   productDetails.put("lux","soap");  //Put elements in productDetails  
		   productDetails.put("colgate","paste");    
		   productDetails.put("pears","soap");   
		   productDetails.put("sony","electronics"); 
		   productDetails.put("samsung","electronics");    
		   System.out.println("Products:"+productDetails);
		   
		   HashMap<String,Integer> salesDetails=new HashMap<String,Integer>();//creating second hashproductDetails
		   //System.out.println("Iterating HashproductDetails...");  
		   salesDetails.put("lux", 1000);
		   salesDetails.put("colgate",500);
		   salesDetails.put("pears",2000);
		   salesDetails.put("sony",100);
		   salesDetails.put("samsung",600);
		   System.out.println("Sales:"+salesDetails);
		   
		   int rate=Integer.parseInt(sc.nextLine());
		   String category=sc.nextLine();
		   salesDetails=priceUpdate(productDetails,salesDetails,rate,category);
		   System.out.println(salesDetails);
		       
		   }  
	}  

