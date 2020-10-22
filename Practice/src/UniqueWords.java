import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class UniqueWords {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Student's Article");
		String str=sc.nextLine();
		
		String [] words=str.split("[, ; : . ? !  ]+");
		System.out.println("Number of words: "+words.length);
		
		@SuppressWarnings("unused")
		Set<String> set = new HashSet<>();
		for(int i=0;i<words.length;i++) {
			set.add(words[i]);
		}
		System.out.println("The hashset contains:"+set);
		
		System.out.println("Number of unique words: "+set.size());
		
		System.out.println("Unique words are: ");
		
		Iterator<String>  itr=set.iterator();
		int i=1;
		while(itr.hasNext()) {
			System.out.println(i+":"+itr.next());
			i+=1;
		}
		
	}
}
