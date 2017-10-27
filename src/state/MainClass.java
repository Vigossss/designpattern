package state;

/**
 * 状态模式
 * 行为设计模式
 * 允许通过改变对象的内部状态而改变对象的行为
 * 这个对象表现得就好像修改了它的类一样
 * 
 * @author 311396
 *
 */
public class MainClass {

	/**
	 * 来自于CSDN的例子
	 * 
	 * 酒店：房间有预订、取消预订、入住、退房四个操作
	 * 预订：可以入住、取消预订
	 * 取消预订：即空闲，可以预订、入住
	 * 入住：可以退房
	 * 退房：等同于空闲
	 * 最终有3个状态：空闲、预订、入住
	 * 
	 */
	
	public static void main(String[] args) {
		/*Room room = new Room();
		room.bookRoom();
		room.unsubcribeRoom();
		room.checkInRoom();
		room.checkOutRoom();*/
		
		//有2间房  
        Room[] rooms = new Room[2];  
        //初始化  
        for(int i = 0 ; i < rooms.length ; i++){  
            rooms[i] = new Room();  
        }  
        //第一间房  
        rooms[0].bookRoom();    //预订  
        rooms[0].checkInRoom();   //入住  
        rooms[0].bookRoom();    //预订  
        System.out.println(rooms[0]);  
        System.out.println("---------------------------");  
          
        //第二间房  
        rooms[1].checkInRoom();  
        rooms[1].bookRoom();  
        rooms[1].checkOutRoom();  
        rooms[1].bookRoom();  
        System.out.println(rooms[1]);  
	}
}
