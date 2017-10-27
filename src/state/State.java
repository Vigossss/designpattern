package state;

public interface State {
	/**
	 * 预订
	 */
	void bookRoom();
	
	/**
	 * 取消预订
	 * [səbˈskraɪb] 订阅，订购
	 */
	void unsubcribeRoom();
	
	/**
	 * 入住
	 */
	void checkInRoom();
	
	/**
	 * 退房
	 */
	void checkOutRoom();
}
