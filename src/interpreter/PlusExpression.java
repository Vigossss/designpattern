package interpreter;

public class PlusExpression extends Expression {

	@Override
	void interpreter(Context ctx) {
		System.out.println("自动递增");
		//获得上下文环境
		String input = ctx.getInput();
		//类型转换
		int intInput = Integer.valueOf(input);
		//递增
		++intInput;
		//更新上下文,均要更新
		ctx.setInput(String.valueOf(intInput));
		ctx.setOutput(intInput);
	}

}
