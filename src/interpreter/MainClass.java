package interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * 解释器模式
 * 行为模式
 * 特殊的设计模式，建立一个解释器，
 * 对于特定的计算机程序语言，
 * 用来解释预先定义的文法
 * 
 * @author 311396
 *
 */
public class MainClass {
	public static void main(String[] args) {
		String num = "10";
		
		Context ctx = new Context();
		ctx.setInput(num);
		
		Expression exp = new PlusExpression();
		exp.interpreter(ctx);
		
		ctx.display();
		
		exp = new MinusExpression();
		exp.interpreter(ctx);
		
		ctx.display();
		
		List<Expression> exps = new ArrayList<Expression>();
		exps.add(exp);
		exps.add(exp);
		
		for(Expression ex : exps){
			ex.interpreter(ctx);
		}
		ctx.display();
		
	}
}
