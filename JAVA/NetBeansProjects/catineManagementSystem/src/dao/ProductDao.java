/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Product;
import java.sql.*;

/**
 *
 * @author ntahetonyblaise
 */
public class ProductDao {
    public static void save(Product p) {
        String sql = "insert into product(name, category, price) values('"+p.getName()+"', '"+p.getCategory()+"', '"+p.getPrice()+"')";
        DbOperations.setDataOrDelete(sql, "Product added succefully");
        
    }
    public static ArrayList<Product> getAllRecords() {
        ArrayList<Product> productList = new ArrayList<>();
        
        try {
            ResultSet rs = (ResultSet) DbOperations.getData("select * from product");
            
            while (rs.next()) {
                Product p = new Product();
                p.setId(rs.getInt("id"));
                p.setName(rs.getString("name"));
                p.setCategory(rs.getString("category"));
                p.setPrice(rs.getString("price"));
                productList.add(p);
            }
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        return productList;
    }
    public static void update(Product p) {
        String sql = "update product set name='"+p.getName()+"', category='"+p.getCategory()+"', price='"+p.getPrice()+"' where id='"+p.getId()+"'";
        DbOperations.setDataOrDelete(sql, "Data updated successfully");
    }
    public static void delete(String id) {
        String sql = "delete from product where id='"+id+"'";
        DbOperations.setDataOrDelete(sql, "Data deleted successfully");
    }
}
