package flyweight.example;

import java.util.HashMap;
import java.util.Map;

public class MyCharacterFactory {
	private Map<Character, MyCharacter> pool;
	
	public MyCharacterFactory(){
		this.pool = new HashMap<Character, MyCharacter>();
	}
	
	public MyCharacter getMyCharacter(Character chr){
		MyCharacter mychr = pool.get(chr);
		if(mychr == null){
			mychr = new MyCharacter(chr);
			pool.put(chr, mychr);
		}
		return mychr;
	}
}
