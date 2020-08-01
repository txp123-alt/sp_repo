package cn.tedu.sp01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**这个类中包含商品的基本信息*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {
	//测试版本
	private Integer id;      //商品的Id
	private String name;	 //商品的名字
	private Integer number;  //商品的库存
}
