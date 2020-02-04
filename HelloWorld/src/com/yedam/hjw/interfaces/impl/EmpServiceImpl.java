package com.yedam.hjw.interfaces.impl;

import com.yedam.hjw.interfaces.model.EmpService;
import com.yedam.hjw.interfaces.model.Employee;

public class EmpServiceImpl implements EmpService { // EmpService 를 구현

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
	public void delEmp(int empNo, Employee[] emps) {
		for (int i = 0; i < emps.length; i++) {
			if (emps[i] != null && emps[i].getEmpNo() == empNo) {
				emps[i] = null;
			}
		}
	}

}
