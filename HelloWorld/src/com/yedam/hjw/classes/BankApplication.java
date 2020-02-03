package com.yedam.hjw.classes;

import java.util.Scanner;

public class BankApplication {
	static Account[] acntAry = new Account[10]; //필드영역 (main 밖, class 안) 꺼내줌

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		boolean run = true;

		while (run) {
			System.out.println("==============================================");
			System.out.println("1.계좌 생성|2.예금|3.출금|4.계좌목록|5.계좌조회|9.종료");
			System.out.println("==============================================");
			System.out.println("선택 >");
			int selectNo = scn.nextInt();
			scn.nextLine();
			if (selectNo == 1) {// 계좌생성
				System.out.println("계좌번호 입력 : ");
				String ano = scn.nextLine();
				System.out.println("이름 입력 : ");
				String owner = scn.nextLine();
				System.out.println("금액 입력 : ");
				int balance = scn.nextInt();
				Account acnt = new Account(ano, owner, balance);
				for (int i = 0; i < acntAry.length; i++) {
					if (acntAry[i] == null) {
						acntAry[i] = acnt;
						break;
					}
				}
			}
			if (selectNo == 2) {// 예금
				System.out.println("조회 계좌 입력");
				String acntNo = scn.nextLine();
				Account acnt = findAccount(acntNo);
				System.out.println("입금액을 입력");
				int amount = scn.nextInt();
				acnt.setBalance(amount); // Account 클레스의 setBalance 호출
			}
			if (selectNo == 3) {// 출금
				System.out.println("조회 계좌 입력");
				String acntNo = scn.nextLine();
				Account acnt = findAccount(acntNo);
				System.out.println("출금액을 입력");
				int amount = scn.nextInt();
				acnt.withdrawBalance(amount); // Account 클레스의 withdrawBalance 메서드 호출
			}
			if (selectNo == 4) {// 계좌목록
				for (int i = 0; i < acntAry.length; i++) {
					if (acntAry[i] != null)// 값이 있는 경우만 출력하겠다.
						System.out.println(acntAry[i]);
				}
			}
			if (selectNo == 5) {// 계좌조회
				System.out.println("조회 계좌 입력");
				String acntNo = scn.nextLine();
				Account acnt = findAccount(acntNo);
				System.out.println(acnt);

			} else if (selectNo == 9) {
				run = false;
				System.out.println("프로그램 종료. bye");
			}

		} // end of while
	}// end of main

	public static Account findAccount(String acntNo) {// 계좌정보를 가져오는 메소드
		Account acnt = null;
		for (int i = 0; i < acntAry.length; i++) {
			if (acntAry[i] != null && acntNo.equals(acntAry[i].getAno())) {
				acnt = acntAry[i];
			}
		}
		return acnt;
	}

}// end of class
