package com.yedam.hjw.interfaces.impl;

import java.util.List;

import com.yedam.hjw.interfaces.model.EmpService;
import com.yedam.hjw.interfaces.model.Employee;
import com.yedam.hjw.interfaces.model.Employees;

public class EmpServiceImpl implements EmpService { // EmpService 를 구현하는 서비스

	@Override
	public void addEmp(Employee emp, Employee[] emps) {
		for (int i = 0; i < emps.length; i++) {
			if (emps[i] == null) {
				emps[i] = emp;
				break;
			}
		}
		System.out.println("입력 완료.");

	}

	@Override
	public void searchEmp(int empNo, Employee[] emps) {
		for (Employee emp : emps) {
			if (emp != null && emp.getEmpNo() == empNo) {
				System.out.println(emp);
			}
			System.out.println("조회 내용이 없습니다.");
		}
	}

	@Override
	public void empList(Employee[] emps) {
		for (Employee emp : emps) {
			if (emp != null) {
				System.out.println(emp);
			}
		}

	}

	@Override
	public void delEmp(int empNo, Employee[] emps) { // 삭제기능
		for (int i = 0; i < emps.length; i++) {
			if (emps[i] != null && emps[i].getEmpNo() == empNo) {
				emps[i] = null;
			}
		}
	}

	@Override
	public void insertEmployees(Employees emp) {
		System.out.println("DB 입력기능");
		EmpDAO dao = new EmpDAO();
		dao.insertEmployees(emp);

	}

	@Override
	public void searchEmployees() {
		System.out.println("DB조회");
		EmpDAO dao = new EmpDAO();
		Employees[] empArray = dao.getEMployees();
		for (Employees emp : empArray) {
			if (emp != null) {
				System.out.println(emp);
			}
		}

	}

	@Override
	public List<Employees> getDBEmployees() {
		EmpDAO dao = new EmpDAO();
		return dao.getEmpList();
	}

	@Override
	public Employees getDBEmployee(int empId) {
		EmpDAO dao = new EmpDAO();
		return dao.getEmployee(empId);
	}

	@Override
	public void insertDBEmp(Employees emp) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateDBEmp(Employees emp) {
		EmpDAO dao = new EmpDAO();
		dao.updateEmployees(emp);
	}

}
