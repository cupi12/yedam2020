package com.yedam.hjw.interfaces.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.hjw.interfaces.common.DAO;
import com.yedam.hjw.interfaces.model.Employees;

public class EmpDAO {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	// 1. DB 전체 조회
	public List<Employees> getEmpList() {
		conn = DAO.getConnect();
		String sql = "SELECT * FROM emp_temp"; // sql구문
		List<Employees> list = new ArrayList<>();
		try {
			pstmt = conn.prepareStatement(sql); // sql구문을 연결하라.
			rs = pstmt.executeQuery(); // executeQuery 메소드는 rs타입으로 반환시켜준다.
			while (rs.next()) { // rs.next()에 데이터가 있으면 참이다.
				Employees emp = new Employees();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emp.setHireDate(rs.getString("hire_date"));
				emp.setJobId(rs.getString("job_id"));
				emp.setSalary(rs.getInt("salary"));
				list.add(emp);

			} // end of while

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DAO.close(conn); //
		}
		return list; // list값을 리턴해준다.
	}// end of List<Employees> getEmpList()
		// 2. DB 한건 조회

	public Employees getEmployee(int emps) {
		conn = DAO.getConnect();
		String sql = "SELECT * FROM emp_temp where employee_id = ?";
		Employees emp = new Employees();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, emps);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setEmail(rs.getString("email"));
				emp.setPhoneNumber(rs.getString("phone_number"));
				emp.setHireDate(rs.getString("hire_date"));
				emp.setJobId(rs.getString("job_id"));
				emp.setSalary(rs.getInt("salary"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DAO.close(conn);
		}
		return emp;
	}

	// 3. DB 입력

	// 4. DB 수정
	public void updateEmployees(Employees emp) {
		conn = DAO.getConnect();
		String sql = "update emp_temp " + "set first_name = first_name";
		if (emp.getSalary() != 0)
			sql = sql + ", salary = salary + ?";
		if (emp.getEmail() != null)
			sql = sql + ", email = ?";
		sql += "where employee_id = ?";

		try {
			pstmt = conn.prepareStatement(sql);
			int cnt = 0;
			if (emp.getSalary() != 0)
				pstmt.setInt(++cnt, emp.getSalary());

			if (emp.getEmail() != null)
				pstmt.setString(++cnt, emp.getEmail());

			pstmt.setInt(++cnt, emp.getEmployeeId());
			int r = pstmt.executeUpdate();
			System.out.println(r + "건이 변경되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DAO.close(conn);
		}
	}

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
