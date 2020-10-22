import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		List<Member> list=new  ArrayList<>();
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter the number of Members:");
		int n=Integer.parseInt(inp.nextLine());
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter the Member Details:");
			String[]  str=inp.nextLine().split(":");
			Member member=new Member(str[0],str[1],str[2]);
			list.add(member);
			
		}
		System.out.println("Enter the number of times Membership category needs to be searched:");
		int nooftimes=Integer.parseInt(inp.nextLine());
		
		String[]  cat=new String[nooftimes];
		for(int i=0;i<nooftimes;i++){
			System.out.println("Enter the Category");
			cat[i]=inp.nextLine();
		}
		
		for(int i=0;i<cat.length;i++) {
			ZEEShop z=new ZEEShop(cat[i],list);
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
