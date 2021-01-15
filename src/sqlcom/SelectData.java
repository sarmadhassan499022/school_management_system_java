/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlcom;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author hp
 */
public class SelectData {

    String host="jdbc:derby://localhost:1527/SchoolManagement";
        String username = "School";
        String password = "school";
        public ResultSet getdata(String query)
        {
            ResultSet rs=null;
            try{
                Connection con=DriverManager.getConnection(host,username,password);
                Statement stmt=con.createStatement();
                rs=stmt.executeQuery(query);
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "An Error Occured!!"+e);
            }
            return rs;
        }
        public void delete(String query){
            try{
                Connection con=DriverManager.getConnection(host,username,password);
                Statement stmt=con.createStatement();
                stmt.execute(query);
                JOptionPane.showMessageDialog(null, "Deleted!!");
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "An Error Occured!!"+e);
            }
        }
        public void update(String query){
            try{
                Connection con=DriverManager.getConnection(host,username,password);
                Statement stmt=con.createStatement();
                stmt.execute(query);
                JOptionPane.showMessageDialog(null, "Updated!!");
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "An Error Occured!!"+e);
            }
        }
        public void insert(String query){
            try{
                Connection con=DriverManager.getConnection(host,username,password);
                Statement stmt=con.createStatement();
                stmt.execute(query);
                JOptionPane.showMessageDialog(null, "Saved!!");
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Error Occured!!"+e);
            }
        }
    public static void main(String args[]) {
        // TODO code application logic here
    }
}
