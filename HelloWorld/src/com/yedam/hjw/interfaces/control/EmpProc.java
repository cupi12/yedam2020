package com.yedam.hjw.interfaces.control;

import java.util.Scanner;

import com.yedam.hjw.interfaces.impl.EmpServiceImpl;
import com.yedam.hjw.interfaces.impl.EmpServiceImpl2;
import com.yedam.hjw.interfaces.model.EmpService;
import com.yedam.hjw.interfaces.model.Employee;
import com.yedam.hjw.interfaces.model.Employees;

public class EmpProc {
	Employee[] employees = new Employee[10];
	Scanner scn = new Scanner(System.in);
	EmpService service = new EmpServiceImpl();

	public void execute() {

		System.out.println("프로그램 시작");
		while (true) {
			System.out.println("============================================");
			System.out.println("1.추가| 2.조회| 3.리스트| 4.삭제| 5.종료 | 6.DB조회");
			System.out.println("============================================");
			System.out.println("선택 >");
			int menu = scn.nextInt();
			scn.nextLine();
			if (menu == 1) {
				System.out.println("이름 :");
				String name = scn.nextLine();

				System.out.println("사원번호 :");
				int empNo = scn.nextInt();

				System.out.println("급여 :");
				int salary = scn.nextInt();

				Employee emp = new Employee(name, empNo, salary);
				service.addEmp(emp, employees);

			} else if (menu == 2) {
				System.out.println("사원번호 입력 : ");
				int no = scn.nextInt();
				service.searchEmp(no, employees);
			} else if (menu == 3) {
				service.empList(employees);
			} else if (menu == 4) {
				System.out.println("사원번호 입력 : ");
				int no = scn.nextInt();
				service.delEmp(no, employees);
			} else if (menu == 5) {
				break;
			} else if (menu == 6) {
				service.searchEmployees();
			} else if (menu == 7) {
				System.out.println("last입력");
				String lastName = scn.nextLine();
				System.out.println("이메일 입력");
				String email = scn.nextLine();
				System.out.println("업무 입력");  //IT_PROG
				String jobId = scn.nextLine();
				Employees emp = new Employees();
				emp.setLastName(lastName);
				emp.setEmail(email);
				emp.setJobId(jobId);
				
				service.insertEmployees(emp);
			}

		} // end of while
		System.out.println("프로그램 종료");
	}// end of execute
}// end of class