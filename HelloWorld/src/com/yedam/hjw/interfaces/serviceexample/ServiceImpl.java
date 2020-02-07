package com.yedam.hjw.interfaces.serviceexample;

import java.util.ArrayList;
import java.util.List;

import com.yedam.hjw.interfaces.model.Employees;

public class ServiceImpl implements Service {

	@Override
	public void addMember(Employees emp, List<Employees> list) {
		list.add(emp);
		
		
	}

	@Override
	public Employees getMember(int memberId, List<Employees> list) {
		forEmployees
		System.out.println(memberId);
	}//1명보기

	@Override
	public List<Employees> getMemberList(List<Employees> list) {
		List<Employees> destList = new ArrayList<>();
		for(Employees emp : list) 
		if(emp != null){
			destList.add(emp);
		}
		return destList;
	}

	@Override
	public void updateMember(Employees emp, List<Employees> list) {
		list.get
		
	}

}
