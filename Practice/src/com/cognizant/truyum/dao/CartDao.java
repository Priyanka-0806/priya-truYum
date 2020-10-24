package com.cognizant.truyum.dao;

public class CartDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
package com.cognizant.truyum.dao; 
2 
 
3 import java.util.List; 
4 
 
5 import com.cognizant.truyum.model.MenuItem; 
6 
 
7 public interface CartDao { 
8 	public static void addCartItem(long userId) 
9 	{ 
10 		 
11 	} 
12 	public static List<MenuItem> getAllCartItems(long userId) throws CartEmptyException 
13 	{ 
14 		return null; 
15 		 
16 	} 
17 	public static void removeCartItem(long userUd,long menuItemId) 
18 	{ 
19 		 
20 	} 
21 	 
22 	 
23 } 
