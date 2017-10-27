package flyweight.example;

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
		MyCharacterFactory factory = new MyCharacterFactory();
		Character chr1 = factory.getMyCharacter(new Character('A')).getChr();
		Character chr2 = factory.getMyCharacter(new Character('A')).getChr();
		Character chr3 = factory.getMyCharacter(new Character('B')).getChr();
		
		System.out.println(chr1 == chr2);
		System.out.println(chr1 == chr3);
	}
}
