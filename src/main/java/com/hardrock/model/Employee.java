package com.hardrock.model;

public class Employee {

	private int empId;

	private String empName;

	private String empDes;

	private int empSal;

	/**
	 * @return the empSal
	 */
	public int getEmpSal() {
		return empSal;
	}

	/**
	 * @param empSal
	 *            the empSal to set
	 */
	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}

	/**
	 * @return the empId
	 */
	public int getEmpId() {
		return empId;
	}

	/**
	 * @param empId
	 *            the empId to set
	 */
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}

	/**
	 * @param empName
	 *            the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	/**
	 * @return the empDes
	 */
	public String getEmpDes() {
		return empDes;
	}

	/**
	 * @param empDes
	 *            the empDes to set
	 */
	public void setEmpDes(String empDes) {
		this.empDes = empDes;
	}
}
