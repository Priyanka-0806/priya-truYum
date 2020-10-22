import java.util.*;
public class School extends Thread {
	private String studentCategory;
	private int count;
	private List<Student> studentList;
	public School(String studentCategory,List<Student> studentList) {
		super();
		this.studentCategory = studentCategory;
		//this.count = count;
		this.studentList = studentList;
	}
	public String getStudentCategory() {
		return studentCategory;
	}
	public void setStudentCategory(String studentCategory) {
		this.studentCategory = studentCategory;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public List<Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
	
	public void run() {
		int count=0;
			for(Student st : studentList ) {
				if(st.getStudentCategory().equals(this.studentCategory))
					count+=1;
			}
				System.out.println(this.studentCategory+":"+count);
		}
}


