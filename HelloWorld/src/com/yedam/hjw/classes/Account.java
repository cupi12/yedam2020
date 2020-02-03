package com.yedam.hjw.classes;

//은행계좌를 만드는 클레스
public class Account {
	// 필드 3개 생성
	private String ano; // 계좌번호 필드 설정
	private String owner;
	private int balance; // 잔액확인 필드 설정

	
	
	public Account(String ano, String owner, int balance) {
		super();
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	public String getAno() {
		return ano;
	}

	public String getOwner() {
		return owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int amount) { // 입금 금액 설정하는 메소드 설정
		if (amount >= 10 && amount <= 100000) {
			balance += amount;
		} else { // 이외에는 입금 처리를 하지 않겠다.
			balance += 0;
		}
	}

	public void withdrawBalance(int amount) { // 출금하는 메소드
		if (amount >= 10 && amount <= 10000) {
			balance -= amount;
		} else { // 이외에는 입금 처리를 하지 않겠다. 출금에서는 else 있으나 없으나 마찬가지다.
			balance -= 0;
		}
	}

	@Override
	public String toString() {
		return "Accound [ano=" + ano + ", owner=" + owner + ", balance=" + balance + "]";
	}

}
