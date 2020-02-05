package com.yedam.hjw.interfaces.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.yedam.hjw.interfaces.common.DAO;
import com.yedam.hjw.interfaces.model.Employees;

public class EmpDAO {

	public void insertEmployees(Employees emp) {
		Connection conn = DAO.getConnect();
		String sql = "INSERT INTO emp_temp (employee_id, last_name, email, hire_date, job_id)"
				+ "values(employees_seq.nextval, ?, ?, sysdate, ?)";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, emp.getLastName());
			pstmt.setString(2, emp.getEmail());
			pstmt.setString(3, emp.getJobId());
			int cnt = pstmt.executeUpdate();
			System.out.println(cnt + "건 입력");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}// end of insertEmployees()

	public Employees[] getEMployees() {
		Connection conn = DAO.getConnect();
		String sql = "SELECT * FROM employees";
		Employees[] emps = new Employees[100];
		int cnt = 0;
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery(); // executeQuery < 쿼리를 실행하는 문장
			while (rs.next()) { // .next >> rs에 데이터가 들어잇는 만큼 반복해서 돈다.
				Employees emp = new Employees();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emp.setHireDate(rs.getString("hire_date"));
				emp.setJobId(rs.getString("job_id"));
				emp.setSalary(rs.getInt("salary"));
				emps[cnt++] = emp;

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} // end of try ~ catch
		return emps;
	}// end of getEMployees
}// end of class
