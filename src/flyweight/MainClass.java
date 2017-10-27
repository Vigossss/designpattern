package flyweight;

/**
 * 享元模式[ˈflaɪweɪt](轻量级)
 * 构造型模式
 * 
 * 通过与其他类似对象共享数据来减小内存占用
 * @author 311396
 *
 */
public class MainClass {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		TeacherFactory tf = new TeacherFactory();
		Teacher t1 = tf.getTeacher("11");
		Teacher t2 = tf.getTeacher("11");
		Teacher t3 = tf.getTeacher("12");
		System.out.println(t1 == t2);
		System.out.println(t1 == t3);
	}
}
