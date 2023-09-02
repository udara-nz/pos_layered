/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layerd.dao.custom.impl;

import java.util.ArrayList;
import pos.layerd.dao.CrudUtil;
import pos.layerd.dao.custom.CustomerDao;
import pos.layerd.entity.CustomerEntity;
import java.sql.ResultSet;

/**
 *
 * @author Buddika Isuranga
 */
public class CustomerDaoImpl implements CustomerDao{

    @Override
    public boolean add(CustomerEntity t) throws Exception {
        return CrudUtil.excuteUpdate("INSERT INTO Customer VALUES(?,?,?,?,?,?,?,?,?)",
                t.getId(), t.getTitile(), t.getName(), t.getDob(),
                t.getSalary(), t.getAddress(), t.getCity(), t.getProvince(),
                t.getZip());
    }

    @Override
    public boolean update(CustomerEntity t) throws Exception {
         return CrudUtil.excuteUpdate("UPDATE Customer SET CustTitle =?, CustName=?, DOB=?, salary = ?, custAddress=?, City=?, Province=?, PostalCode=? WHERE CustID=?",
                t.getTitile(), t.getName(), t.getDob(),
                t.getSalary(), t.getAddress(), t.getCity(), t.getProvince(),
                t.getZip(),t.getId());
    }

    @Override
    public boolean delete(String id) throws Exception {
        return CrudUtil.excuteUpdate("DELETE FROM Customer WHERE CustID=?",
                id);
    }

    @Override
    public CustomerEntity get(String id) throws Exception {
       ResultSet rst = CrudUtil.executeQuery("Select * FROM Customer WHERE CustID = ?", id);
       
        while (rst.next()) {
            CustomerEntity customerEntity = new CustomerEntity(rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getDouble(5),
                    rst.getString(6),
                    rst.getString(7),
                    rst.getString(8),
                    rst.getString(9));
            
            return customerEntity;
        }
        return null;
    }

    @Override
    public ArrayList<CustomerEntity> getall() throws Exception {
        ArrayList<CustomerEntity> customerEntitys = new ArrayList<>();
        
         ResultSet rst = CrudUtil.executeQuery("Select * FROM Customer");
         
         while (rst.next()) {
            CustomerEntity customerEntity = new CustomerEntity(rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getDouble(5),
                    rst.getString(6),
                    rst.getString(7),
                    rst.getString(8),
                    rst.getString(9));
            
            customerEntitys.add(customerEntity);
        }
         return customerEntitys;
    }
  
}
