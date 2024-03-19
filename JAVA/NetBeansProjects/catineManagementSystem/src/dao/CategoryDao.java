/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import javax.swing.JOptionPane;
import model.Category;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author ntahetonyblaise
 */
public class CategoryDao {
    public static void save(Category cat) {
        String sql = "insert into category (name) values('"+cat.getName()+"')";
        DbOperations.setDataOrDelete(sql, "category added successfully.");
    }
    public static ArrayList<Category> getAllRecords() {
        ArrayList<Category> arrayList = new ArrayList<>();
        try {
            ResultSet  rs = DbOperations.getData("select * from category");
            
            while (rs.next()) {
                Category cat = new Category();
                cat.setId(rs.getInt("id"));
                cat.setName(rs.getString("name"));
                arrayList.add(cat);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    
    public static void delete(String id) {
        String sql = "delete from category where id='"+id+"'";
        DbOperations.setDataOrDelete(sql, "Category deleted successfully.");
    }
}
