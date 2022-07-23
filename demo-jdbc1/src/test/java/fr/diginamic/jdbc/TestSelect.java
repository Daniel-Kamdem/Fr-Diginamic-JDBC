package fr.diginamic.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.ResourceBundle;

import fr.diginamic.jdbc.entites.fournisseur;

public class TestSelect {

	public static void main(String[] args) {
		
	
					


							ResourceBundle Bundle = ResourceBundle.getBundle("database");
							
							final String url = Bundle.getString("jdbc.db.url");
							final String user = Bundle.getString("jdbc.db.user");
							final String password = Bundle.getString("jdbc.db.pw");
							
							try {
								Connection sql = DriverManager.getConnection( url , user , password );
								
								String roquete = " select * from fournisseur ";
								
								Statement st = sql.createStatement();
								
							ResultSet exe =	st.executeQuery(roquete);
							
							ArrayList<fournisseur> list = new ArrayList<>();
							
							while ( exe.next()) {
								fournisseur f = new fournisseur(exe.getInt("id"), exe.getString("nom"));
								list.add(f);
							}
							
							for( fournisseur f : list) {
								
								System.out.println(f);
							}
							
							System.out.println(exe);
								
					
								
								sql.close();
							} catch (SQLException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}

					

				

			

	}


