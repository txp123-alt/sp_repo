package cn.tedu.sp01.service;

import java.util.List;

import cn.tedu.sp01.pojo.Item;

public interface ItemService {
	
	List<Item> getItems(String orderId);
	void decreaseNumbers(List<Item> list);
}
