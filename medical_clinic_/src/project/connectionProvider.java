/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
package project;
import java.sql.*;
import java.lang.*;

/**
 *
 * @author ASNA AZWAR
 */
public  class connectionProvider {
    public static Connection getCon()
    {
        String ClassName="com.mysql.cj.jdbc.Driver";
      try
      {
          //  Class.forName("com.mysql.jdbc.Driver");
           Class.forName(ClassName);
            
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:2028/medical_clinic","root","abc1234");
            return con;
            
      
      }catch(Exception e)
      {
        return null;
      
      }
     
    }
    
}

   /*String ClassName="com.mysql.cj.jdbc.Driver";
        try {
            Class.forName(ClassName);
            
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:2028/medical_clinic","root","abc1234");
             Statement st=con.createStatement();
            st.executeUpdate("INSERT INTO patient values('2','taniya','0770075398','18','female','0+','colombo','no')");
             System.out.println("success...");
        }catch(ClassNotFoundException ex) {
            System.out.println("driver failed to load");
             System.out.println(ex.getMessage());
        }catch(Exception e){
           
            System.out.println("error ....");
        }
*/
