package com.yedam.hjw.interfaces.model;

public interface EmpService {

	public void addEmp(Employee emp, Employee[] emps); // 저장기능.

	public void searchEmp(int empNo, Employee[] emps); // 조회기능.

	public void empList(Employee[] emps); // 리스트

	public void delEmp(int empNO, Employee[] emps); // 삭제
}
