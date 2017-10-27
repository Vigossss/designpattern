package flyweight;

import java.util.HashMap;
import java.util.Map;

public class TeacherFactory {
	private Map<String, Teacher> pool;
	
	public TeacherFactory(){
		pool = new HashMap<String, Teacher>();
	}
	
	public Teacher getTeacher(String no){
		Teacher t = pool.get(no);
		if(t == null){
			t = new Teacher();
			t.setNo(no);
			pool.put(no, t);
		}
		return t;
	}
}
