
public class Example {
	private int empId;
	private String empname;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	Example(int empId, String empname){
		this.empId=empId;
		this.empname=empname;
	}
	@Override
	public String toString() {
		return "Example [empId=" + empId + ", empname=" + empname + "]";
	}
	
}
