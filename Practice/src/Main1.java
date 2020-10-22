import java.util.*;
public class Main1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Student> studentList=new ArrayList<>();
		
		/*code*/
		System.out.println("Enter the number of students:");
		int n=Integer.parseInt(sc.nextLine());
		System.out.println("Enter the student details:");
		for(int i=0;i< n;i++) {
			String[] crSt=sc.nextLine().split(":");
			Student curr=new Student(crSt[0],crSt[1],crSt[2]);
			studentList.add(curr);
					
		}
		System.out.println("Enter the number of times to be searched:");
		int nooftimes=Integer.parseInt(sc.nextLine());
		
		String[] category=new String[nooftimes];
		for(int i=0;i < nooftimes;i++) {
			System.out.println("Enter the category to be searched ");
			category[i]=sc.nextLine();
		}
		
		for(int i =0;i<category.length;i++) {
			School school=new  School(category[i],studentList);
			Thread th=new Thread(school);
			th.start();
			try {
				th.join();
			}catch(InterruptedException e) {
				e.printStackTrace();
				
			}
		}
		
	}
}
/*5 101:John:Silver
		102:Alex:Platinum
		103:Peter:Gold
		104:Joe:Silver
		105:Haily:Gold*/
