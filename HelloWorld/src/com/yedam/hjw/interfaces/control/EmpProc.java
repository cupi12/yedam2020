package com.yedam.hjw.interfaces.control;

import java.util.List;
import java.util.Scanner;

import com.yedam.hjw.interfaces.impl.EmpServiceImpl;
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
			System.out.println("1.추가| 2.조회| 3.리스트| 4.삭제| 5.종료 | 6.DB조회 | 7.DB입력 | 8.DB수정");
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
				service.addEmp(emp, employees); // employees 배열에 건들을 저장하시오.

			} else if (menu == 2) {
				System.out.println("사원번호 입력 : ");
				int no = scn.nextInt();
				Employees emp = service.getDBEmployee(no);
				System.out.println(emp);
//				service.searchEmp(no, employees);
			} else if (menu == 3) {
				service.empList(employees);
			} else if (menu == 4) {
				System.out.println("사원번호 입력 : ");
				int no = scn.nextInt();
				service.delEmp(no, employees);
			} else if (menu == 5) {
				break;
			} else if (menu == 6) {
//				service.searchEmployees();
				List<Employees> list = service.getDBEmployees(); // List = 컬렉션 자바 유틸매서드 배열처럼 여러건들을 담겠다.
				for (Employees emp : list) {// 확장 for문
					System.out.println(emp);
				}
			} else if (menu == 7) {
				System.out.println("lastName 입력");
				String lastName = scn.nextLine();
				System.out.println("이메일 입력");
				String email = scn.nextLine();
				System.out.println("업무 입력"); // IT_PROG
				String jobId = scn.nextLine();
				Employees emp = new Employees();
				emp.setLastName(lastName);
				emp.setEmail(email);
				emp.setJobId(jobId);

				service.insertEmployees(emp);
			} else if (menu == 8) {
				System.out.println("조회할 사원번호 입력");
				int empId = scn.nextInt();
				scn.nextLine();
				System.out.println("급여 인상" + " 분 입력. (인상 X = 엔터");
				String salNum = scn.nextLine();
				int sal = 0;
				if (salNum != null && !salNum.equals(""))
					sal = Integer.parseInt(salNum); // paraseInt 괄호에 있는 변수의 문자열을 숫자로 바꾸시오.
//				int sal = scn.nextInt();
				System.out.println("변경할 이메일 입력.");
				String email = scn.nextLine();

				Employees emp = new Employees();
				emp.setEmployeeId(empId);
				emp.setSalary(sal);
				emp.setEmail(email);

				service.updateDBEmp(emp);

			}

		} // end of while
		System.out.println("프로그램 종료");
	}// end of execute
}// end of class
