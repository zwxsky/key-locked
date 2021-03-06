package com.philip.client.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.philip.client.cond.OrderCond;
import com.philip.client.model.Order;
import com.philip.client.model.OrderModel;

public interface OrderDao {

	List<Order> queryAll();
	
	List<Order> queryByCond(@Param("cond")OrderCond cond);
	
	Integer countAll();
	
	Integer insert(Order order);
	
	Integer update(Order order);

	Integer countExist(String orderNum);

	Order queryOne(Long id);

	OrderModel queryModel(Long id);
}
