package interpreter;

/**
 * 抽象解释器
 * @author 311396
 *
 */
public abstract class Expression {
	abstract void interpreter(Context ctx);
}
