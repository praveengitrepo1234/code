import java.io.Serializable;

public class Employee implements Comparable<Employee>
{
	
private int empId;
private String empNme;

public Employee(int empId, String empName) {
	this.empId=empId;
	this.empNme=empName;
}

public int getEmpId() {
	return empId;
}



public void setEmpId(int empId) {
	this.empId = empId;
}



public String getEmpNme() {
	return empNme;
}



public void setEmpNme(String empNme) {
	this.empNme = empNme;
}

@Override
public String toString() {
	return "Employee [empId=" + empId + ", empNme=" + empNme + "]";
}

@Override
public int compareTo(Employee o) {
	
	return this.empNme.compareTo(o.getEmpNme());
}




}