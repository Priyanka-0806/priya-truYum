import java.io.Serializable;

public class Employee implements Serializable{
	int eno;
	String ename;
	
	public Employee(int eno, String ename) {
		super();
		this.eno = eno;
		this.ename = ename;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	
	

}
