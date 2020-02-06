package com.yedam.hjw.interfaces.model;

import java.util.List;

public interface EmpService {

	public void addEmp(Employee emp, Employee[] emps); // 저장기능.

	public void searchEmp(int empNo, Employee[] emps); // 조회기능.

	public void empList(Employee[] emps); // 리스트

	public void delEmp(int empNO, Employee[] emps); // 삭제

	public void searchEmployees(); // DB조회

	public void insertEmployees(Employees emp); // DB입력

	// ==collection활용 DB처리
	// 1.전체 데이터 조회.
	public List<Employees> getDBEmployees();

	// 2.한건조회.
	public Employees getDBEmployee(int empId);

	// 3.입력
	public void insertDBEmp(Employees emp);

	// 4.수정
	public void updateDBEmp(Employees emp);

}
