package com.food;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class food_cart {
	public static List<Food> getFoodList() throws ClassNotFoundException, SQLException
	   {
		   String url ="jdbc:mysql://localhost:3308/food";
		   String userName ="root";
		   String password ="root";
		   ArrayList<Food> food = new ArrayList<>();
		   Class.forName("com.mysql.jdbc.Driver");
			Connection con =DriverManager.getConnection(url,userName,password);
			Statement st =con.createStatement();
			ResultSet rs =st.executeQuery("select * from foodcart");
			while(rs.next()) {
				
				int id = rs.getInt(1);
				String item = rs.getString(2);
				int price = rs.getInt(3);
				Food f =new Food(id,item,price);
				food.add(f);
				
			}
			
		   
		   
		   
		  
		 return food;  
       


}
}
