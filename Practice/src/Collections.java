import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence with :");
		String str=sc.nextLine();
		System.out.println("Entered string is : "+str);
		
		//List<String> list=new ArrayList<>();
		
		Set<String> set = new  LinkedHashSet<>();
		String[] str2=str.split(":");
		for(int i=0;i<str2.length;i++) {
			set.add(str2[i].toLowerCase());
			}
		System.out.println(set);
		/*System.out.println("Iterating using Iterator class");
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("The list contains: "+list);
		System.out.println("Using for loop");
		for(String s:list) {
			System.out.println("Element is: "+s);*/
		}
	}



