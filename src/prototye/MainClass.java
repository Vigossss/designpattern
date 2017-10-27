package prototye;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.SerializationUtils;

/**
 * 原型模式
 * 对象创建模式
 * 
 * 复制原型对象的方法来创建对象的实例
 * 具有与原型对象一样的数据
 * @author 311396
 *
 */
public class MainClass {
	/**
	 * 此处因为没有引用属性存在
	 * 所以浅拷贝就可以解决
	 * 
	 * 深拷贝有两种
	 * 第一：傻瓜式的新建拷贝
	 * 第二：流输入、输出来实现新对象复制
	 * 流就需要实现serializeble接口
	 * 不需要的加上transient关键字
	 * 
	 * @param args
	 * @throws CloneNotSupportedException
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		Person p1 = new Person();
		p1.setName("zhangsan");
		
		//此处开始测试出现深拷贝问题
		List<String> fri = new ArrayList<String>();
		fri.add("xiaoping");
		p1.setFriends(fri);
		
		Person p2 = p1.clone();
		System.out.println(p2.getName());
	
		
		p2.setName("lisi");
		System.out.println(p1.getName());
		
		//表现出同一个引用
		System.err.println("\n深度克隆引发问题----------");
		System.err.println("p1  " + p1.getFriends().get(0));
		System.err.println("p2  " + p2.getFriends().get(0) + "\np2设置新值");
		p2.getFriends().set(0, "zemin");
		System.err.println("p2  " + p2.getFriends().get(0));
		System.err.println("p1  " + p1.getFriends().get(0));
		
		//深度克隆
		Person p3 = SerializationUtils.clone(p1);
		System.out.println("\n深度克隆开始----------");
		System.out.println("p3  " + p3.getFriends().get(0) + "\np3设置新值");
		p3.getFriends().set(0, "jintao");
		System.out.println("p3  " + p3.getFriends().get(0));
		System.out.println("p1  " + p1.getFriends().get(0));
	}
}
