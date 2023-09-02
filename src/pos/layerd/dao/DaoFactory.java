/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layerd.dao;

import com.mysql.cj.x.protobuf.MysqlxCrud;
import pos.layerd.dao.custom.CustomerDao;
import pos.layerd.dao.custom.OrderDao;
import pos.layerd.dao.custom.impl.CustomerDaoImpl;
import pos.layerd.dao.custom.impl.ItemDaoImpl;
import pos.layerd.dao.custom.impl.OrderDaoImpl;
import pos.layerd.dao.custom.impl.OrderDetailDaoImpl;

/**
 *
 * @author Buddika Isuranga
 */
public class DaoFactory {
    
    private static DaoFactory daoFactory;
    
    private DaoFactory(){}
    
    public static DaoFactory getInstance(){
        if(daoFactory == null){
            daoFactory = new DaoFactory();
        }
        
        return daoFactory;
    }
    
    public SuperDao getDao(DaoTypes type){
        switch (type) {
            case CUSTOMER:
                return new CustomerDaoImpl();
                case ITEM:
                return new ItemDaoImpl();
                case ORDER:
                return new OrderDaoImpl();
                case ORDER_DETAIL:
                return new OrderDetailDaoImpl();
            default:
                return null;
        }
 
    }

//    public static class DaoTypes {
//
//        public static DaoTypes CUSTOMER;
//
//        public DaoTypes() {
//        }
//    }
    
    public enum DaoTypes{
        CUSTOMER, ITEM, ORDER, ORDER_DETAIL
        
    }
    
}
