package com.yedam.hjw.interfaces.serviceexample;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.yedam.hjw.interfaces.model.Employees;

public class ServiceProc {

//	service.addMember(emp,list);service.getMemberList(list);
//	service.getMember(memberId,list);
//	service.updateMember(emp,list);
	List<Employees> list = new ArrayList<>();
	Service service = new ServiceImpl();
	Scanner scn = new Scanner(System.in);

	public void execute() {
		System.out.println("프로그램 시작");

		while (true) {
			System.out.println("=====================================");
			System.out.println(" 1:추가|2:리스트|3:조회|4:수정|5:종료");
			System.out.println("=====================================");
			System.out.println("선택 >");
			int menu = scn.nextInt();
			int memberId;
			if (menu == 1) {
				Employees emp = new Employees();
				System.out.println("id 입력:");
				int employeeId = scn.nextInt();
				scn.nextLine();
				emp.setEmployeeId(employeeId);

				System.out.println("firstName입력:");
				String firstName = scn.nextLine();
				emp.setFirstName(firstName);
				service.addMember(emp, list);
				System.out.println("추가 완료!");
			} else if (menu == 2) { // 리스트보기
				service.getMemberList(list);
				
			} else if (menu == 3) { // 1명보기
				memberId = scn.nextInt();
				service.getMember(memberId, list);
				
			} else if (menu == 4) { //수정
				Employees emp = new Employees();
				service.updateMember(emp, list);
				
			} else if (menu == 5) {
				System.out.println("bye");
				break;
			}
		} // end of while
	}// end of execute()
}
// end of class
