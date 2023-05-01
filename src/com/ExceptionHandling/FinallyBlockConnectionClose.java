package com.ExceptionHandling;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//Finally block without using throws

public class FinallyBlockConnectionClose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Connection con=null;
PreparedStatement ps=null;
ResultSet rs=null;

try {
	// Open Resources
} catch (Exception e) {
	// TODO: handle exception
	//Handling expection
}
finally {
	try {
		rs.close();
	} catch (SQLException e2) {
		// TODO: handle exception
		// ignored
	}
	try {
		ps.close();
	} catch (SQLException e2) {
		// TODO: handle exception
		//ignored
	}
	try {
		con.close();
	} catch (SQLException e2) {
		// TODO: handle exception
		//ignored
	}
}
	}

}
