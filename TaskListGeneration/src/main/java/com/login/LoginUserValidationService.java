package com.login;
// 1.Importing Packages
import java.sql.*;
public class LoginUserValidationService {
	boolean ResultFlg;
	
	public boolean userValid(String user,Integer Password){
		
		try{
			//Generating JDBC Connection 
			Class.forName ("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","HR","HR");
			if (con != null) {
			System.out.println("Got connection");
			}
			Statement st = con.createStatement();
			//Executing Query
			ResultSet rs = st.executeQuery("Select FIRST_NAME  ,EMPLOYEE_ID from Employees ");
			//Looping through the Result
			while(rs.next()){
			String FN = rs.getString("FIRST_NAME");
			Integer EI = rs.getInt("EMPLOYEE_ID");
			if(user.equals(FN) && Password.equals(EI)) {
				ResultFlg = true;
				return(ResultFlg);
			}
			else{
				System.out.println("Incorrect user");
				continue;
				}
		}
			con.close();
			System.out.println("Flag is false");
			return(ResultFlg);
		}
		catch(Exception e){
			System.out.println(e);
			return(ResultFlg);
		}
	
	}
}
