import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeUtility {

	public Employee[] getEmployeeDetails(String[] details) {

		//Fill your code here
        Employee[] empAr = new Employee[details.length];
        for(int i=0;i<empAr.length;i++){
            String[] empDetails= details[i].split(";");
            Employee currentEmp= new Employee();
            currentEmp.setEmpId(empDetails[i]);
            currentEmp.setEmpName(empDetails[1]);
            currentEmp.setSalary(Double.parseDouble(empDetails[2]));
            empAr[i]=currentEmp;
            
            }
          return empAr;  
            
           /*Map<String,Double> empMap = new Hashmap<>();
           String[] empdetails = empMap.values().toArray(new String[0]);*/
	}

	public Stream<Employee> getStreamOfEmployee(Employee[] empDetails) {

		//Fill your code here
		Stream<Employee> empStream = Arrays.asList(empDetails).stream();
        return empStream;


	}

	public String[] shortlistedEmployee(Stream<Employee> empStream,double minSalary) {

		//Fill your code here
		List<Employee> empList=empStream.filter(e->e.getSalary()>=minSalary).sorted().collect(Collectors.toList());
		String[] shortList=new String[empList.size()];
		int c=0;
		for(Employee e1:empList){
		    shortList[c]=e1.getEmpId()+" "+e1.getEmpName()+" "+e1.getSalary();
		    c=c+1;
		}
        return shortList;
	}

}
