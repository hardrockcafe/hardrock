package com.hardrock.model;

import java.math.BigDecimal;

public class Employee {

	private String empId;

	private String empName;

	private String empDes;

	private BigDecimal empSal;

	/**
	 * @return the empSal
	 */
	public BigDecimal getEmpSal() {
		return empSal;
	}

	/**
	 * @param empSal
	 *            the empSal to set
	 */
	public void setEmpSal(BigDecimal empSal) {
		this.empSal = empSal;
	}

	/**
	 * @return the empId
	 */
	public String getEmpId() {
		return empId;
	}

	/**
	 * @param empId
	 *            the empId to set
	 */
	public void setEmpId(String empId) {
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
