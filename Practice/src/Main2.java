import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class Main2 {
	public static void main(String[] args) {
		
		List<Member> list=new ArrayList<>();
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the number of Members: " );
		@SuppressWarnings("unused")
		int n=Integer.parseInt(sc.nextLine());
		for(int i=0;i<n;i++) {
		System.out.println("Enter the member details: ");
		String[] str=sc.nextLine().split(":");
		Member member=new  Member(str[0],str[1],str[2]);
		list.add(member);
		}
		System.out.println("Enter the number of times Membership category needs to be searched");
		int nooftimes=Integer.parseInt(sc.nextLine());
		String[] cat=new String[nooftimes];
		
		for(int i=0;i < cat.length;i++) {
			System.out.println("Enter the Category ");
			cat[i]=sc.nextLine();
			}
		for(int i=0;i<cat.length;i++) {
			 ZEEShop z= new ZEEShop(cat[i],list);
			 Thread th=new Thread(z);
			 th.start();
			 try {
				 th.join();
			 }catch(InterruptedException e) {
				 e.printStackTrace();
			 }
		
		}
	}
}

		
	

