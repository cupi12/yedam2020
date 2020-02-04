package com.yedam.hjw.classes.extendPkg;

import java.util.Scanner;

public class Friendproc {
	Scanner scn = new Scanner(System.in);
	Friend[] friends = new Friend[10];

	public Friend getFriend(String searchName) {
		Friend friend = null;
		for (Friend f : friends) { // friends 가 배열이고 f 배열을 받는다.
			if (f != null && f.getName().equals(searchName))
				friend = f;
		}
		return friend;
	}

	public void addFriend() {// 친구추가 메소드
//		System.out.println("");
		// int[] addFriend = new int[20];
		System.out.println("1.대학친구 2.회사친구 3.그외");
		int subMenu = scn.nextInt();
		scn.nextLine();
		System.out.println("이름 입력 :");
		String name = scn.nextLine();
		System.out.println("번호 입력 :");
		String phone = scn.nextLine();
		Friend friend = null;
		if (subMenu == 1) { // 1)대학친구
			System.out.println("학교 입력 :");
			String univ = scn.nextLine();
			friend = new UnivFriend(name, phone, univ);
		} else if (subMenu == 2) {// 2)회사친구
			System.out.println("회사 입력 :");
			String company = scn.nextLine();
			friend = new ComFriend(name, phone, company);
		} else if (subMenu == 3) {// 3)그 외 친구들
			friend = new Friend(name, phone);

		}
		for (int i = 0; i < friends.length; i++) {// 배열에 값을 넣어줌
			if (friends[i] == null) {
				friends[i] = friend;
				break;
			}
		}
	}

	public void listFriend() {// 친구리스트확인 메소드
		for (Friend friend : friends) { // friends배열에 들어가 있는 갯수 만큼만 반복
			if (friend != null)
				friend.showInfo();
		}
	}

	public void updateFriend() {// 친구정보변경 메소드
		System.out.println("찾을 이름을 입력 : ");
		String name = scn.nextLine();
		Friend f = getFriend(name);
		if (f == null) {
			System.out.println("조회 결과 없음");
//			return; // 이 메소드를 끝내겠다.
		} else {
			System.out.println("변경할 번호를 입력 : ");
			String phone = scn.nextLine();
			f.setPhone(phone);
			System.out.println("변경 완료");
		}
	}

	public void delFriend() {// 삭제 메소드
		System.out.println("삭제할 이름 입력");
		String name = scn.nextLine();
		boolean isExist = false; // false값을 주고,
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && friends[i].getName().equals(name)) {
				friends[i] = null;
				isExist = true; // 삭제가 되었다면 true로 바뀜
			}
		}
		if (isExist) { // isExist 값이 true일때, 삭제되었습니다. 출력
			System.out.println("삭제되었습니다.");
		} else // isExist가 거짓일 경우, 조건에 해당되는 값이 없습니다. 출력

		{
			System.out.println("조건에 해당되는 값이 없습니다.");
		}
	}

	public void exec() { // exec메소드 생성

		boolean run = true;
		while (run) {
			System.out.println("======================================");
			System.out.println(" 1.입력 | 2.리스트 | 3.수정 | 4.삭제 | 9.종료");
			System.out.println("======================================");
			int menu = scn.nextInt();
			scn.nextLine();
			if (menu == 1) {// 입력
				addFriend();
			} else if (menu == 2) {// 리스트
				listFriend();
			} else if (menu == 3) {// 수정
				updateFriend();
			} else if (menu == 4) {// 삭제
				delFriend();
			} else if (menu == 9) {// 종료

				run = false;
			} // end of if
		} // end of while
		System.out.println("프로그램 종료");
	}// end of exec
}// end of class
