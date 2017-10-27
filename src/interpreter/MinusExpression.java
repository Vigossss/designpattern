package interpreter;

public class MinusExpression extends Expression {

	@Override
	void interpreter(Context ctx) {
		System.out.println("自动递减");
		//获得上下文环境
		String input = ctx.getInput();
		//类型转换
		int intInput = Integer.valueOf(input);
		//递增
		--intInput;
		//更新上下文
		ctx.setInput(String.valueOf(intInput));
		ctx.setOutput(intInput);
	}

}
