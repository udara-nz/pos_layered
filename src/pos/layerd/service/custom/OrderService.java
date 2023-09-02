/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pos.layerd.service.custom;

import pos.layerd.dto.OrderDto;
import pos.layerd.service.SuperService;

/**
 *
 * @author Buddika Isuranga
 */
public interface OrderService extends SuperService{
    String placeOrder(OrderDto dto) throws Exception;
    
}
