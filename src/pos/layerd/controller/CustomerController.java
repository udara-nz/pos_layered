/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.layerd.controller;

import java.util.ArrayList;
import pos.layerd.dto.CustomerDto;
import pos.layerd.service.custom.CustomerService;
import pos.layerd.service.ServiceFactory;
import static pos.layerd.service.ServiceFactory.ServiceType.CUSTOMER;

/**
 *
 * @author Buddika Isuranga
 */
public class CustomerController {
    
       CustomerService customerService = (CustomerService) ServiceFactory.getIntance().getService(CUSTOMER);

    
    public String addCustomer(CustomerDto customerDto) throws Exception {
       return customerService.addCustomer(customerDto);
        
    } 

    public ArrayList<CustomerDto> getAllCustomers() throws Exception {
        return customerService.getALLCustomer();
    }

    public String updateCustomer(CustomerDto customerDto) throws Exception {
       return customerService.updateCustomer(customerDto);
    }

    public String deleteCustomer(String id) throws Exception {
        return customerService.deleteCustomer(id);
    }

    public CustomerDto getCustomer(String custId) throws Exception {
        return customerService.getCustomer(custId);
    }
    
}
