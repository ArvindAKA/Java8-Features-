package generalcode;

public class Employee {
	@Override
	public String toString() {
		return "Employee [dept=" + dept + ", empName=" + empName + ", empSal=" + empSal + "]";
	}

	public Employee(String dept, String empName, Integer empSal) {
		super();
		this.dept = dept;
		this.empName = empName;
		this.empSal = empSal;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Integer getEmpSal() {
		return empSal;
	}

	public void setEmpSal(Integer empSal) {
		this.empSal = empSal;
	}

	private String dept;
	private String empName;
	private Integer empSal;

	public Employee() {

	}

}
