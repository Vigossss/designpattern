package testfactory;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 工厂模式在应用的实现
 * 
 * @author 311396
 *
 */
public class MainClass {
	/**
	 * 1.接受控制台输入
	 * 2.进行运算
	 * 3.返回结果
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("----接收计算器输入----");
		
		System.out.println("请输入第一个操作数");
		Scanner scan = new Scanner(System.in);
		String num1 = scan.nextLine();
		System.out.println("请输入运算符");
		String oper = scan.nextLine();
		System.out.println("请输入第二个操作数");
		String num2 = scan.nextLine();
		
		Pattern p = Pattern.compile("[+|-|*|/]");
		Matcher m = p.matcher(oper);
		if(m.lookingAt()){
			/*if("+".equals(oper)){
//				System.out.println(Integer.valueOf(num1) + Integer.valueOf(num2));
				
				Operation op = new AddOperation();
				op.setNum1(Integer.valueOf(num1));
				op.setNum2(Integer.valueOf(num2));
				System.out.println(op.getResult());
			}*/
			
			Operation op = OperationFactory.opration(oper);
			op.setNum1(Integer.valueOf(num1));
			op.setNum2(Integer.valueOf(num2));
			System.out.println(op.getResult());
		}
	}
}
