package com.coforge.CrmBeanClass;

public class EmployeeInfo {

	private int 	employeeInfoId;	
	private String  employeeMob;
	private String  employeeDOB;
	private String  employeeCountary;
	private String  employeecity;
	private int     employeepincode;

	private  Employee employee;

	public EmployeeInfo(int employeeInfoId, String employeeMob, String employeeDOB, String employeeCountary,
			String employeecity, int employeepincode, Employee employee) {
		super();
		this.employeeInfoId = employeeInfoId;
		this.employeeMob = employeeMob;
		this.employeeDOB = employeeDOB;
		this.employeeCountary = employeeCountary;
		this.employeecity = employeecity;
		this.employeepincode = employeepincode;
		this.employee = employee;
	}

	public int getEmployeeInfoId() {
		return employeeInfoId;
	}

	public void setEmployeeInfoId(int employeeInfoId) {
		this.employeeInfoId = employeeInfoId;
	}

	public String getEmployeeMob() {
		return employeeMob;
	}

	public void setEmployeeMob(String employeeMob) {
		this.employeeMob = employeeMob;
	}

	public String getEmployeeDOB() {
		return employeeDOB;
	}

	public void setEmployeeDOB(String employeeDOB) {
		this.employeeDOB = employeeDOB;
	}

	public String getEmployeeCountary() {
		return employeeCountary;
	}

	public void setEmployeeCountary(String employeeCountary) {
		this.employeeCountary = employeeCountary;
	}

	public String getEmployeecity() {
		return employeecity;
	}

	public void setEmployeecity(String employeecity) {
		this.employeecity = employeecity;
	}

	public int getEmployeepincode() {
		return employeepincode;
	}

	public void setEmployeepincode(int employeepincode) {
		this.employeepincode = employeepincode;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((employeeCountary == null) ? 0 : employeeCountary.hashCode());
		result = prime * result + ((employeeDOB == null) ? 0 : employeeDOB.hashCode());
		result = prime * result + employeeInfoId;
		result = prime * result + ((employeeMob == null) ? 0 : employeeMob.hashCode());
		result = prime * result + ((employeecity == null) ? 0 : employeecity.hashCode());
		result = prime * result + employeepincode;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeInfo other = (EmployeeInfo) obj;
		if (employeeCountary == null) {
			if (other.employeeCountary != null)
				return false;
		} else if (!employeeCountary.equals(other.employeeCountary))
			return false;
		if (employeeDOB == null) {
			if (other.employeeDOB != null)
				return false;
		} else if (!employeeDOB.equals(other.employeeDOB))
			return false;
		if (employeeInfoId != other.employeeInfoId)
			return false;
		if (employeeMob == null) {
			if (other.employeeMob != null)
				return false;
		} else if (!employeeMob.equals(other.employeeMob))
			return false;
		if (employeecity == null) {
			if (other.employeecity != null)
				return false;
		} else if (!employeecity.equals(other.employeecity))
			return false;
		if (employeepincode != other.employeepincode)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "EmployeeInfo [employeeInfoId=" + employeeInfoId + ", employeeMob=" + employeeMob + ", employeeDOB="
				+ employeeDOB + ", employeeCountary=" + employeeCountary + ", employeecity=" + employeecity
				+ ", employeepincode=" + employeepincode + ", employee=" + employee + "]";
	}
	
	
}
