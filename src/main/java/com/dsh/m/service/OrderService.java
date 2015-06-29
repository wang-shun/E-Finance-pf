package com.dsh.m.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.dsh.m.dao.PurchaseorderChildMapper;
import com.dsh.m.dao.PurchaseorderMapper;
import com.dsh.m.dao.SupplyCustomerMapper;
import com.dsh.m.enumtype.OrderStatusEnum;
import com.dsh.m.model.Goods;
import com.dsh.m.model.Purchaseorder;
import com.dsh.m.model.PurchaseorderChild;
import com.dsh.m.model.SupplyCustomer;
import com.dsh.m.model.SupplyCustomerExample;
import com.dsh.m.util.OrderUtil;

@Service
public class OrderService {
	
	@Autowired
	private SupplyCustomerMapper supplyCustomerMapper;
	@Autowired
	private PurchaseorderMapper purchaseorderMapper;
	@Autowired
	private PurchaseorderChildMapper purchaseorderChildMapper;
	@Autowired
	private ShoppingCartService shoppingcartService;
	
	@Transactional
	public int createOrder(Integer userid, JSONArray products) {
		
		SupplyCustomerExample example = new SupplyCustomerExample();
		example.createCriteria().andCustomeridEqualTo(userid);
		List<SupplyCustomer> list = supplyCustomerMapper.selectByExample(example);
		Integer supplyid = null;
		if(CollectionUtils.isNotEmpty(list)) {
			supplyid = list.get(0).getSupplyid();
		}
		
		Purchaseorder order = new Purchaseorder();
		order.setOrdernum(OrderUtil.generateOrderNo());
		order.setCustomerid(userid);
		order.setSupplyid(supplyid);
		order.setOrdertype(OrderStatusEnum.WAIT.getCode());
		order.setChildcount(products.size());
		order.setOrdertime(new Date());
		purchaseorderMapper.insertSelective(order);
		int orderid = order.getId();
		@SuppressWarnings("rawtypes")
		Iterator iter = products.iterator();
		while(iter.hasNext()) {
			JSONObject json = (JSONObject)iter.next();
			Goods goods = (Goods)json.get("goods");
			int num = json.getIntValue("num");
			PurchaseorderChild child = new PurchaseorderChild();
			child.setOrderid(orderid);
			child.setGoodsid(goods.getGoodsid());
			child.setAmount(new BigDecimal(num));
			purchaseorderChildMapper.insertSelective(child);
		}
		
		shoppingcartService.clearUserCart(userid);
		return orderid;
	}

}
