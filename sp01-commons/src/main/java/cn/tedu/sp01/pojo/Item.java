package cn.tedu.sp01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**������а�����Ʒ�Ļ�����Ϣ*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {
	//���԰汾
	private Integer id;      //��Ʒ��Id
	//����111111111111111111
	private String name;	 //��Ʒ������
	private Integer number;  //��Ʒ�Ŀ��
}