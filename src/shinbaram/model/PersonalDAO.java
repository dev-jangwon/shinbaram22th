package shinbaram.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import shinbaram.model.dto.PersonalDTO;

public class PersonalDAO {

	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;

	final static String SQL = "SELECT * FROM PERSONAL_PAGE WHERE NAME = ? AND BIRTH = ?";

	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			if (conn == null)
				conn = DriverManager
						.getConnection("");

		} catch (ClassNotFoundException e) {

			e.printStackTrace();

		} catch (SQLException e) {

			e.printStackTrace();

		}
		return conn;
	}

	public void closeConnection() {
		try {
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			// do nothing
		}
	}

	public PersonalDTO Select(String name, String birth) {

		PersonalDTO personalDTO = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			if (conn == null)
				conn = DriverManager
						.getConnection("");
			pstmt = conn.prepareStatement(SQL);

			pstmt.setString(1, name);
			pstmt.setString(2, birth);

			rs = pstmt.executeQuery();

			while (rs.next()) {

				personalDTO = new PersonalDTO();

				personalDTO.setName(rs.getString("NAME"));
				personalDTO.setBirth(rs.getString("BIRTH"));
				personalDTO.setMent(rs.getString("MENT"));
				personalDTO.setPicURL(rs.getString("PICURL"));
				personalDTO.setVideoURL(rs.getString("VIDEOURL"));

			}

			return personalDTO;

		} catch (ClassNotFoundException e) {

			e.printStackTrace();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException e) {
				}
			;

			if (rs != null)
				try {
					rs.close();
				} catch (SQLException e) {
				}
			;

			if (conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
				}
			;

		}

		return null;
	}

}
