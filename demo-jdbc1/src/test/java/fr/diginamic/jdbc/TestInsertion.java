package fr.diginamic.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class TestInsertion {
	public static void main(String[]args) {
		


				ResourceBundle Bundle = ResourceBundle.getBundle("database");
				
				final String url = Bundle.getString("jdbc.db.url");
				final String user = Bundle.getString("jdbc.db.user");
				final String password = Bundle.getString("jdbc.db.pw");
				
				try {
					Connection sql = DriverManager.getConnection( url , user , password );
					
					String roquete = " insert into fournisseur (id , nom) values (4 ,'La Maison de la peinture')";
					
					Statement st = sql.createStatement();
					
				int exe =	st.executeUpdate(roquete);
				
				System.out.println(exe);
					
		
					
					sql.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		

	}

