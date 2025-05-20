package com.demo.beans;

import java.util.Objects;

public class Employee {
	private int empno;
	private String ename;
	private String mobno;
	private double sal;
	public Employee() {
		super();
	}
	public Employee(int empno, String ename, String mobno, double sal) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.mobno = mobno;
		this.sal= sal;
	}
	
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getMobno() {
		return mobno;
	}
	public void setMobno(String mobno) {
		this.mobno = mobno;
	}
	
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", mobno=" + mobno + ", sal=" + sal + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(ename);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(ename, other.ename);
	}
	

}
